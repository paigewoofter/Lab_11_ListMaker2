import java.util.Scanner;
public class SafeInputs {


    // Part A

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    // Part B

    public static int getInt(Scanner pipe, String prompt) {

        int integerInput = 0;
        boolean done = false;
        String trash = "";


        do {
            System.out.println("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                integerInput = pipe.nextInt();

                System.out.println("You entered the integer: " + integerInput);

                done = true;


            } else {
                trash = pipe.nextLine();
                System.out.println("Error: " + trash + " ,You have to enter an integer");
            }
        } while (!done);

        return integerInput;
    }

    // Part C

    public static double getDouble(Scanner pipe, String prompt) {

        double doubleInput = 0;
        boolean done = false;
        String trash = "";


        do {
            System.out.println("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                doubleInput = pipe.nextDouble();

                System.out.println("You entered the integer: " + doubleInput);

                done = true;


            } else {
                trash = pipe.nextLine();
                System.out.println("Error: " + trash + " ,You have to enter an integer");
            }
        } while (!done);

        return doubleInput;

    }

    // Part D

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("\n" + prompt);

            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();

                if (retVal >= low && retVal <= high) {

                    done = true;

                } else {
                    trash = pipe.nextLine();
                    System.out.println("\nThe number is out of range [" + low + "-" + high + "]: " + trash);
                }

            } else {
                trash = pipe.nextLine();
                System.out.println("Error: " + trash + " ,You have to enter an integer");
                done = true;
            }


        } while (!done);

        return retVal;

    }

    // Part E

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {

        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("\n" + prompt);

            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();

                if (retVal >= low && retVal <= high) {

                    done = true;

                } else {
                    trash = pipe.nextLine();
                    System.out.println("\nThe number is out of range [" + low + "-" + high + "]: " + trash);
                }

            } else {
                trash = pipe.nextLine();
                System.out.println("Error: " + trash + " ,You have to enter an integer");
                done = true;
            }


        } while (!done);

        return retVal;
    }
    //Part F

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String respYN = "";
        boolean retVal = false;
        boolean done = false;

        do {
            System.out.println(prompt + "[Y/N]: ");
            respYN = pipe.nextLine();
            if (respYN.equalsIgnoreCase("Y")) {
                retVal = true;
                done = true;
            } else if (respYN.equalsIgnoreCase("N")) {
                retVal = false;
                done = true;
            } else {
                System.out.println("You must enter [Y/N]: ");
            }
        } while (!done);
        return retVal;
    }

    private static String pipe() {
        return null;
    }

    // Part G

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {

        String retVal = "";
        String trash = "";
        boolean done = false;

        do {
            System.out.println("\n" + prompt + ": ");
            retVal = pipe.nextLine();
            if (retVal.matches(regEx)) {
                done = true;
            } else {
                System.out.println("\n" + retVal + " must match the pattern " + regEx);
                System.out.println("Try Again!");
            }
        } while (!done);


        return retVal;

    }

    // Part H

    public static String prettyHeader(String msg) {


        String header = "";

        System.out.println("\n" + msg + ": ");


        for (int i = 0; i < 1; i++) {

            for (int f = 0; f <= 60; f++) {
                System.out.print("*");
            }
            System.out.println("");


        }
        for (int i = 0; i < 1; i++) {

            System.out.print("**");
            for (int f = 0; f <= 13; f++) {
                System.out.print(" ");
            }
            System.out.print(msg);
            for (int f = 0; f <= 20; f++) {
                System.out.print(" ");
            }
            System.out.print("**");
        }


        for (int i = 0; i < 1; i++) {

            System.out.println(" ");
            for (int f = 0; f <= 60; f++) {
                System.out.print("*");
            }
            System.out.println("");


        }

        return header;
    }

    // Lab 9 - getAverage

    public static Object getAverage(int values[]){

        return null;
    }
}