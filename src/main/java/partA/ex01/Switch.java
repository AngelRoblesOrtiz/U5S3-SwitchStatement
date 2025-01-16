package partA.ex01;

import java.util.Scanner;

public class Switch {

    public static String switchStatement(){
        String response = "";

        /* Put your code in between these comments : Top */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number corresponding to a month below: ");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }

        /* Put your code in between these comments : Bottom */



        return response;
    }
    public static void main(String args[]) {
        String switchOutput = switchStatement();
        System.out.println(switchOutput);
    }
}
