import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {

        String SSN;
        String birthDayMonth;
        int favNum = 0;
        double money;
        int month;
        double price;
        boolean hasCat;
        Scanner in = new Scanner(System.in);

    // String test
        birthDayMonth = SafeInput.getNonZeroLenString(in, "What is your name?");
        System.out.println(birthDayMonth);


    // Int test
        favNum = SafeInput.getInt(in, "What is your favorite number?");
        System.out.println(favNum);

        // Double Test
        money = SafeInput.getDouble(in, "How much money do you have? ");
        System.out.println(money);


    //Ranged int test
        month = SafeInput.getRangedInt(in, "Select a month. ", 1, 12);
        System.out.println(month);


    //Ranged double test
        price = SafeInput.getRangedDouble(in, "What is the price? ", 0, 1000);
        System.out.println(price);

        //Get Y/N
        hasCat = SafeInput.getYNConfirm(in, "Do you have a cat? ");
        System.out.println(hasCat);

        //Regex
        SSN = SafeInput.getRegExString(in, "What is your SSN?", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println(SSN);
    }
}