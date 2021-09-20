package Exercise4;
/* Lexi LaMonica
 * Spring 2021
 * Assignment 2*/
/**
 * Resuming the solution of the previous exercise, lets suppose we want to make our bookstore sell also music albums.
 * So, lets create the Album class, bearing in mind that even for music albums there is an identification number called
 * ISMN as well as for books there is the ISBN identification number. Then check if there is an inheritance relationship
 * between the Book class and the Album class. If it exists, implement a solution
 */

import java.util.ArrayList;

class Book {
    String bookName;
    String genre;
    double price;
    String author;
    long ID;
    public Book() {
        super();}
/* Parameterised constructor */
    public Book(Long ID, String bookName, String author, double price, String genre) {
        super();
        this.ID = ID;
        this.bookName = bookName;
        this.price = price;
        this.author = author;
        this.genre = genre;
    }
    public Long getID(){return ID; }
    public void setId(){ this.ID = ID;}
    public String getBookName(){ return bookName; }
    public void setBookName(String bookName){ this.bookName = bookName; }
    public String getGenre(){ return genre; }
    public void setGenre(String genre){ this.genre = genre; }
@Override
    public String toString(){ return "Identification Code: " + ID +", "+ "Book Name: " + bookName + ", " + "Author: " + author + ", " + "Price: " + price + ", " + "Genre: " + genre;
    }

}
/* I did more then what the instructions asked for but thought I would just leave it in*/
class Album extends Book {
    Long ID;
    String name, artist;
    private Book book;
    public Album(Long ID, String name, String artist, Book book) {
        super();
        this.artist = artist;
        this.name = name;
        this.ID = ID;
        this.book = new Book();
    }
    public String getTitle(){return name;}
    public void setTitle(String title) {
        this.name = name;
    }
    public String getArtist(){return artist;}
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public Book getBook(){
        return book; }
    public String toString() {
        String result = String.format("%d %s %s , ", ID, name, artist);
        return result + book;
    }
}

class bookCase{
    ArrayList<Book> bookCase = new ArrayList<>();
    String genre;
    bookCase(String genre){
        this.genre = genre; }
    public bookCase() { }
       void addBook(Book bookObj){
        if(bookObj.getGenre().compareTo(genre) == 0){
            bookCase.add(bookObj);
        } else{
            System.out.println("Book is not available");
        }
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getGenre(){
        return genre;
    }
    public void setBookcase(ArrayList<Book> bookCase){
        this.bookCase = bookCase;
    }
    public ArrayList<Book> getBookcase(){ return bookCase; }
    public String toString(){
        String string = "";
        string = string + genre + ": \n";
        for(Book bookObj : bookCase){
            string = string + "\t" + bookObj.toString() + "\n";
        }
        string = string + "\n";
        return string;
    }
}
class Bookstore{
    private static Bookstore instance;
    ArrayList<bookCase> bookstore = new ArrayList<>();
    private Bookstore(){ }
    static Bookstore get_instance(){
        if(instance == null){
            instance = new Bookstore();
        }
        return instance;
    }
    void addBookcase(bookCase b){
        boolean flag = false;
        for(bookCase bookcase:bookstore){
            if( bookcase.getGenre().compareTo( b.getGenre() ) == 0) {
                System.out.println("This genre is already in the book case." +"\n"+ "Please add a genre that is not in book case");
                flag = true; }
        }
        if(flag == false){
            bookstore.add(b); }
    }
    public String toString() {
        String string = " ";
        for (bookCase b : bookstore) {
            string = string + b.toString();
        }
        return string;
    }
}
class BookstoreTest{
    public static void main(String[] args) {
/* make a instance of bookstore class */
        Bookstore bookStore = Bookstore.get_instance();
        System.out.println("~Welcome To The BookStore~"+"\n"+  "\t"+"Here are the current book cases: "+"\n");
        bookCase compArchitecture = new bookCase("Computer architecture");
        bookCase textbook = new bookCase("Textbook");
/* add books of same genre to the bookcase */
        Book book1 = new Book(9786L, "Code: The Hidden Language of Computer Hardware and Software", "Charles Petzold", 65.75, "Computer architecture");
        Book book2 = new Book(67565L, "Algorithms", "Robert Sedgewick", 98.34, "Textbook");
        compArchitecture.addBook(book1);
        textbook.addBook(book2);
/* add bookcases to the bookstore */
        bookStore.addBookcase(compArchitecture);
        bookStore.addBookcase(textbook);

        System.out.println(bookStore);
    }
}