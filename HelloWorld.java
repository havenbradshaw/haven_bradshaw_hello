/**
 * Represents a greeter with a name and age.
 */
public class HelloWorld {
    String name; 
    private int age;

    /**
     * Constructs a HelloWorld object with the given name.
     * @param name The name of the person
     */
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

    // Overloaded greet method to allow a custom message
    /**
     * Greets the user with a custom message.
     * @param message The custom greeting message
     */
    public void greet(String message) {
        System.out.println(message);
    }

    /**
     * Sets the name and age for this greeter.
     * @param name The name to set
     * @param age The age to set
     * @return The age that was set
     */
    public int setAge(int age) {
        this.age = age;
        return age;
    }
    /**
     * Introduces the greeter by name and age.
     * @param name The name to introduce
     * @param age The age to introduce
     */
    public void introduce() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }     
    
}