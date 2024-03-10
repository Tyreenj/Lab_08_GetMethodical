import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //Ints for time
        int birthYear;
        int birthMonth;
        int birthDay;
        int birthHour;
        int birthMinute;

        //Input for year and month
        birthYear = SafeInput.getRangedInt(in, "What year were you born? ", 1950, 2015);
        birthMonth = SafeInput.getRangedInt(in, "What month were you born? ", 1, 12);

        //Checks how many days in each month and limits the amount of days that can be entered depending on the month
        switch(birthMonth)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                birthDay = SafeInput.getRangedInt(in, "What day were you born? ", 1, 31);
                break;
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                birthDay = SafeInput.getRangedInt(in, "What day were you born? ", 1, 30);
                break;
            case 2:
                birthDay = SafeInput.getRangedInt(in, "What day were you born? ", 1, 29);
                break;
        }

        //Input for hours and minutes
        birthHour = SafeInput.getRangedInt(in, "What hour were you born? ", 1, 24);
        birthMinute = SafeInput.getRangedInt(in, "What minute were you born? ", 0, 59);
    }
}
