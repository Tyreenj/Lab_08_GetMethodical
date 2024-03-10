import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //Variable for what header displays
        String header;

        // Gets what you want header to display
        header = SafeInput.getNonZeroLenString(in, "What would you like your header to display? ");

        // Prints your input in a header
        SafeInput.prettyHeader(header);
    }
}
