import java.util.Scanner;

public class Solution01 {
/* Begin pseudocode */
    // Create variable to store username (can contain greeting) (type: String).
    // Create Scanner variable.
    // Create variable to store string read by the variable.
    // Prompt the user for their name.
    // Use concat() to join the two strings (set first variable to concatenated value.
    // Print variable.
/* End pseudocode */

    public static void main(String[] args){
        String greet = "Hello, ";
        Scanner nameRead = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = nameRead.nextLine();
        greet = greet.concat(name);
        System.out.println(greet + ", nice to meet you!");
    }

}
