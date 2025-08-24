import java.util.Scanner;

/**
 * Launches the HelloWorld application.
 */
public class AppLauncher {

    /**
     * Prompts the user for two students' names and ages, then demonstrates all of the HelloWorld class methods.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println(" ****   **** ");
    System.out.println("****** ******");
    System.out.println(" *********** ");
    System.out.println("   *******  ");
    System.out.println("    *****   ");
    System.out.println("      *    ");
    System.out.println("Welcome to HelloWorld!");
    System.out.println("---------------------------------");
    System.out.println("                                 ");

        try {
            // Get info for student 1
            System.out.print("Enter name for student 1: ");
            String name1 = scanner.nextLine();
            System.out.print("Enter age for student 1: ");
            int age1 = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            if (name1.trim().isEmpty()) {
                throw new IllegalArgumentException("Name for student 1 cannot be empty.");
            }
            if (age1 < 0) {
                throw new IllegalArgumentException("Age for student 1 cannot be negative.");
            }

            // Get info for student 2
            System.out.print("Enter name for student 2: ");
            String name2 = scanner.nextLine();
            System.out.print("Enter age for student 2: ");
            int age2 = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            if (name2.trim().isEmpty()) {
                throw new IllegalArgumentException("Name for student 2 cannot be empty.");
            }
            if (age2 < 0) {
                throw new IllegalArgumentException("Age for student 2 cannot be negative.");
            }


            HelloWorld student1 = new HelloWorld(name1, age1);
            HelloWorld student2 = new HelloWorld(name2, age2);

            // Call methods for student 1
            student1.greet();
            student1.greet("Welcome to Java, " + name1 + "!");
            student1.introduce();

            // Call methods for student 2
            student2.greet();
            student2.greet("Welcome to Java, " + name2 + "!");
            student2.introduce();

        } catch (IllegalArgumentException e) {
            System.out.println("Input error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

}

