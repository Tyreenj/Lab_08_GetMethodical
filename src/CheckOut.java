import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Variables for item price and total price
        double price = 0;
        double total = 0;

        //Repeats until customer is out of items
        boolean done = true;
        do {
            //Input for each price
            price = SafeInput.getRangedDouble(in, "What is the price of your item? ", 0.50, 10.00);

            //Computes total price
            total = total + price;

            //Gets input for whether user is done
            done = SafeInput.getYNConfirm(in, "Do you have more items?");
        } while (done);
        //Prints total
        System.out.printf("Your total is " +total);
    }
}
