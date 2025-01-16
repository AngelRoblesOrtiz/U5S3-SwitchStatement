package partB.ex01;

import java.util.Scanner;

public class IfLight {
    public static String ifLight(){
        String response = "";

        /* Put your code in between these comments : Top */
        response += "Next Traffic Light is ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a color code: ");
        System.out.println("(1) Green");
        System.out.println("(2) Yellow");
        System.out.println("(3) Red");
        int currentColor = scanner.nextInt();

        if (currentColor == 1) {
            response += "yellow";
        } else if (currentColor == 2) {
            response += "red";
        } else if (currentColor == 3) {
            response += "green";
        } else {
            response = "Invalid Color";
        }



        /* Put your code in between these comments : Bottom */



        return response;
    }
    public static void main(String args[]) {
        String switchOutput = ifLight();
        System.out.println(switchOutput);
    }
}
