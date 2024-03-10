import java.util.Scanner;

public class Reggie {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Strings
        String SSN;
        String mNumber;
        String menuChoice;

        //Input for SSN with RegEx
        SSN = SafeInput.getRegExString(in, "What is your SSN? ", "^\\d{3}-\\d{2}-\\d{4}$");
        //Input for M number with RegEx
        mNumber = SafeInput.getRegExString(in, "What is your M number? ", "^(M|m)\\d{5}$");
        //Input for menu choice with RegEx
        menuChoice = SafeInput.getRegExString(in, "What is your menu choice? Open-O, Save-S, View-V, Quit-Q ", "^[OoSsVvQq]$");
    }
}
