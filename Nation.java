package Q4;
/*  
*Author: Lexi LaMonica
*All rights reserved
*/
/** Create a City class that abstracts the concept of city (not an abstract class).
 * Then declare a Nation class declaring a capital instance variable of type City.
 * */
public class Nation {
    public String name;
    public City capital;
    public double population;
    public Nation(String name, City capital, double population){
        this.name = name;
        this.capital = capital;
        this.population = population;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public City getCapital() {
        return capital;
    }
    public void setCapital(City capital) {
        this.capital = capital;
    }
    public double getPopulation() {
        return population;
    }
    public void setPopulation(double population) {
        this.population = population;
    }
    @Override
    public String toString() {
        return "Nation name is " + name +
                ",\nCapital " + capital +
                ",\nPopulation is " + population;
    }
    }
