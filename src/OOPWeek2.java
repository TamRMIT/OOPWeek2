import java.util.Scanner;

public class OOPWeek2
{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Which exercise?");
        int choice = input.nextInt();

        switch (choice)
        {
            case 3:
                pyramid();
                break;
            case 4:
                daysinmonth();
                break;
            default:
                break;
        }
    }

    public static void pyramid()
    {
        System.out.println("Enter number: ");
        int number = input.nextInt();
        for (int i = 0; i < number; i++)
        {
            for (int j = -15; j <= 15; j++)
            {
                if (Math.abs(j) <= i)
                    System.out.print(Math.abs(j) + 1 + "\t");
                else System.out.print(" \t");
            }
            System.out.print("\n");
        }
    }

    public static void daysinmonth()
    {
        String month;
        System.out.println("Enter month:");
        month = input.next();
        System.out.println("Enter year:");
        int year = input.nextInt();

        int days;
        if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec"))
        {
            days = 31;
        }
        else if (month.equals("Feb"))
        {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                days = 29;
            else days = 28;
        }
        else days = 30;

        if (month.equals("Jan") || month.equals("Feb"))
            System.out.println(month + "uary " + year + " has " + days + " days " );
        if (month.equals("Mar"))
            System.out.println(month + "ch " + year + " has " + days + " days " );
        if (month.equals("Apr"))
            System.out.println(month + "il " + year + " has " + days + " days " );
        if (month.equals("May"))
            System.out.println(month + " " + year + " has " + days + " days " );
        if (month.equals("Jun"))
            System.out.println(month + "e " + year + " has " + days + " days " );
        if (month.equals("Jul"))
            System.out.println(month + "y " + year + " has " + days + " days " );
        if (month.equals("Aug"))
            System.out.println(month + "ust " + year + " has " + days + " days " );
        if (month.equals("Sep"))
            System.out.println(month + "tember " + year + " has " + days + " days " );
        if (month.equals("Oct"))
            System.out.println(month + "ober " + year + " has " + days + " days " );
        if (month.equals("Nov") || month.equals("Dec"))
            System.out.println(month + "ember " + year + " has " + days + " days " );
    }
}
