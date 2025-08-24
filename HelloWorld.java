/**
 * A simple class that greets users by name and introduces them by age.
 */
public class HelloWorld {
    String name; 
    private int age;

    /**
     * Constructs a HelloWorld object with the given name.
     **/
    public HelloWorld(String name, int age) { 
        this.name = name; 
        this.age = age;
    } 

    /**
     * Greets the user with their name.
     */
    public void greet() { 
        System.out.println("Hello, " + name + "!"); 
    } 

    /**
     * Overloads greet method to allow a custom message
     */
    public void greet(String message) {
        System.out.println(message);
    }

    /**
     * Sets the name and age for this greeter.
     * Returns the age that was set
     */
    public int setAge(int age) {
        this.age = age;
        return age;
    }
    /**
     * Introduces the greeter by name and age.
     */
    public void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }     
    
}