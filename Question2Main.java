package Q4;
/* Lexi LaMonica
 * Spring 2021
 * Midterm*/
/**Finally, create an Question2Mainclass that creates a nation with a capital, and
* prints a sentence that verifies the actual association
* between the nation and the capital. Create constructors for these classes.
* Some possible attributes for Nation class can be name, capital, and population
**/
public class Question2Main {
    public static void main(String[] args){
        City capital = new City("Washington");
        Nation nation = new Nation("United States", capital,8865000 );
        System.out.println(nation.toString());
    }
}
