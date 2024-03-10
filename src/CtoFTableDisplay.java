public class CtoFTableDisplay {

    public static void main(String[] args)
    {
        // Prints first line of table
        System.out.println("C      F");

        //Creates subsequent rows
        for(int i = -100; i <= 100; i++)
        {
            //Computes Fahrenheit temperature for each C
            double fTemp = CtoF(i);

            //Prints the row
            System.out.println(i +"   " +fTemp);
        }

    }

    //Method to convert C to F
    public static double CtoF(double Celsius)
    {
        double Fahrenheit;

        //Computes C to F
        Fahrenheit = ((Celsius * 9) / 5) + 32;

        return Fahrenheit;
    }
}
