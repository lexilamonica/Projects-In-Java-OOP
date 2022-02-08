package Q4;
/* Lexi LaMonica
 * Spring 2021
 * Midterm*/
/** Create a City class that abstracts the concept of city (not an abstract class).
* Then declare a Nation class declaring a capital instance variable of type City.

* Finally, create an Question2Mainclass that creates a nation with a capital, and
* prints a sentence that verifies the actual association
* between the nation and the capital. Create constructors for these classes.
* Some possible attributes for Nation class can be name, capital, and population.
**/
public class City {
    public String cityName;
    public City(String cityName) {
        this.cityName = cityName;
    }
    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
@Override
    public String toString() {
    return "City Name is " + cityName ;
    }




}
