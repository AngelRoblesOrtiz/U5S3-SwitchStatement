package partB.ex02;

import java.util.Scanner;

public class SwitchLight {
    public static String switchLight(){
        String response = "";

        /* Put your code in between these comments : Top */
        response += "Next Traffic Light is ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a color code: ");
        System.out.println("(1) Green");
        System.out.println("(2) Yellow");
        System.out.println("(3) Red");
        int currentColor = scanner.nextInt();

        switch (currentColor) {
            case 1:
                response += "yellow";
                break;
            case 2:
                response += "red";
                break;
            case 3:
                response += "green";
                break;
            default:
                response = "Invalid color";
        }

        /* Put your code in between these comments : Bottom */



        return response;
    }
    public static void main(String args[]) {
        String switchOutput = switchLight();
        System.out.println(switchOutput);
    }
}
