import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Strings for first and last name
        String firstName = "";
        String lastName = "";

        //Input for each string
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");

        //Outputs first name + last name = full name
        System.out.println("\nYour full name is: " +firstName +" " +lastName);
    }
}
