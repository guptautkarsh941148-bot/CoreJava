import java.util.*;

// Custom Exception Class
class ExceptionLineTooLong extends Exception {
    public ExceptionLineTooLong(String message) {
        super(message);
    }
}

public class Assignment7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        try {
            // Check string length
            if (input.length() > 80) {
                throw new ExceptionLineTooLong("The string is too long");
            } else {
                System.out.println("String length: " + input.length());
            }
        } catch (ExceptionLineTooLong e) {
            System.out.println(e.getMessage());
        }
    }
}
