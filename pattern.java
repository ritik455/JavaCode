import java.util.Scanner;

//Defining class
public class pattern {
    // Main function
    public static void main(String args[]) {
        String fn = "", ln = "";
        char ch1 = ' ', ch2 = ' ';
        Scanner Sc = new Scanner(System.in);
        // Input operation
        System.out.println("Enter your first name in uppercase:");
        fn = Sc.nextLine();
        System.out.println("Enter your last name in uppercase:");
        ln = Sc.nextLine();
        // Calculating the length of two strings
        int len1 = fn.length();
        int len2 = ln.length();
        // Printing the required pattern for first name
        System.out.println("Pattern for first name:");
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len1; j++) {
                // printing the character if below condition is true
                if ((i == j) || ((i + j) == len1 - 1)) {
                    ch1 = fn.charAt(i);
                    System.out.print(ch1);
                }
                // otherwise print a whitespace
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        // Printing the required pattern for last name
        System.out.println("Pattern for last name:");
        for (int i = 0; i < len2; i++) {
            for (int j = 0; j < len2; j++) {
                // printing the character if below condition is true
                if ((i == j) || ((i + j) == len2 - 1)) {
                    ch2 = ln.charAt(i);
                    System.out.print(ch2);
                }
                // otherwise print a whitespace
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        Sc.close();
    }
}
