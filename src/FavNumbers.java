import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favInt;
        double favDouble;

        // Gets Favorite int
        favInt = SafeInput.getInt(in, "What's your favorite integer?");
        // Gets favorite double
        favDouble = SafeInput.getDouble(in, "What's your favorite double?");
    }
}
