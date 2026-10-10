package ie.atu.oop.week1;

import java.util.Scanner;

public class ExceptionWarmUp
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean valid = false;

        while (!valid) {
            //You want it to loop until they enter the correct number
            System.out.println("Enter a pagecount ");
            String message = sc.nextLine();
            try {
                // try to convert to a number
                int pagecount = Integer.parseInt(message);
                System.out.println("You entered: " + pagecount);
                valid = true;
                //Use scanner to read input from the keyboard
            } catch (NumberFormatException e) {
                System.out.println("Invalid input " + e.getMessage());
            }
        }

    }
}
