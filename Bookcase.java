package Exercise3;
import java.util.ArrayList;
/* Lexi LaMonica
 * Spring 2021
 * Assignment 2*/
/**
 * Taking into account the previous exercise, create also the Bookcase class(understood as a bookcase inside a bookstore).
 * Each bookcase must be dedicated to a certain literary genre included in the list of genres chosen in the previous
 * exercise, and therefore must contain only books of the same genre. In the Bookcase class there must be a method
 * called addBook(Book book), which allows you to add a book with the correct genre to the bookcase.
 * Also create the Bookstore class. A bookstore must contain only one bookcase for each genre, and therefore it is
 * necessary to prevent that two bookcases with the same genre can be added. Finally create a BookstoreTest class,
 * which creates an object of type Bookstore adding to it objects of type Bookcase to which have been added objects
 * of type Book. Verify that two bookcases with the same genre cannot be added to the bookstore.
 **/

class Book {
    String bookName; String genre; double price; String author; public Book() { super(); }
    /* Parameterised constructor */
    public Book(String bookName, String author, double price, String genre) {
        super();
        this.bookName = bookName;
        this.price = price;
        this.author = author;
        this.genre = genre;
    }
    public String getBookName(){ return bookName; }
    public void setBookName(String bookName){ this.bookName = bookName; }
    public String getGenre(){ return genre; }
    public void setGenre(String genre){ this.genre = genre; }
@Override
    public String toString(){ return "Book Name: " + bookName + ", " + "Author: " + author + ", " + "Price: " + price + ", " + "Genre: " + genre;
    }
}
class bookCase{
    ArrayList<Book> bookCase = new ArrayList<>();
    String genre;
    bookCase(String genre){
        this.genre = genre;
    }
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
    public ArrayList<Book> getBookcase(){
        return bookCase; }
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
    private static Bookstore instance = null;
    ArrayList<bookCase> bookstore = new ArrayList<>();
    private Bookstore(){ }
    public static Bookstore get_instance(){
        if(instance == null){
            instance = new Bookstore();
        }
        return instance;
    }
    void addBookcase(bookCase b){
        boolean flag = false;
        for(bookCase bookcase : bookstore){
            if( bookcase.getGenre().compareTo( b.getGenre() ) == 0) {
                System.out.println("This genre is already in the book case." +"\n"+ "Please add a genre that is not in book case");
                flag = true;
            }
        }
        if(flag == false){
            bookstore.add(b); }
    }
    public String toString(){
        String string = " ";
        for(bookCase b : bookstore){
            string = string + b.toString(); }
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
        bookCase selfHelp = new bookCase("Self-help");
        bookCase biography = new bookCase("Biography");

/* add books of same genre to the bookcase */
        Book book1 = new Book("Code: The Hidden Language of Computer Hardware and Software", "Charles Petzold", 65.75, "Computer architecture");
        Book book2 = new Book("Algorithms", "Robert Sedgewick", 98.34, "Textbook");
        compArchitecture.addBook(book1);
        textbook.addBook(book2);
        Book book3 = new Book("How to think like a computer scientist", "Allen B. Downey", 15.99, "Textbook");
        Book book4 = new Book("Algorithms to Live By: The Computer Science of Human Decisions", "Tom Griffiths and Brian Christian", 16.00, "Self-help");
        textbook.addBook(book3);
        selfHelp.addBook(book4);
        Book book5 = new Book("Educated", "Tara Westover", 19.87, "Biography");
        biography.addBook(book5);
/* add bookcases to the bookstore */
        bookStore.addBookcase(compArchitecture);
        bookStore.addBookcase(textbook);
        bookStore.addBookcase(selfHelp);
//        How to check if a book is already there
        //bookStore.addBookcase(compArchitecture);
        bookStore.addBookcase(biography);
        System.out.println(bookStore);



    }
}