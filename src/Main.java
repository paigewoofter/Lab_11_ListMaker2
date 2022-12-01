import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    static ArrayList<String> menuList = new ArrayList<>();




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean Quit = false;
        boolean done = false;
        String userInput = "";
        String choiceMenu = "";

        int listNumber;




        do {
            System.out.print("\n Select an option: ");
            choiceMenu = SafeInputs.getRegExString(in, "\n A: Add \n D: Delete \n P: Print \n Q: Quit", "[AaDdPpQq]");

            switch (choiceMenu) {
                case "A": case "a":
                    userInput = SafeInputs.getNonZeroLenString(in, "Type your entry, then enter: ");
                    menuList.add(userInput);
                    System.out.println(userInput + " has been added. ");
                    break;
                case "D": case "d":
                    if (menuList.size() > 0) {
                        displayArrayList();
                        listNumber = SafeInputs.getRangedInt(in, "Select the list number you'd like to delete: ", 1, menuList.size());
                        listNumber = listNumber - 1;
                        System.out.println("This item has been deleted from the list " + menuList.get(listNumber));
                        menuList.remove(listNumber);
                    }
                    else {
                        System.out.println("\n There is nothing in the list to delete.");
                    }
                    break;
                case "P": case "p":
                    displayArrayList();
                    break;
                case "Q": case "q":
                    Quit = SafeInputs.getYNConfirm(in, "Are you sure you want to quit?: ");
                    if (Quit) {
                        System.out.println("Quit successfully.");
                        System.exit(0);
                    }
                    break;
            }
        } while (!done);
    }
    private static void displayArrayList() {
        int counter = 0;
        if (menuList.size() == 0) {
            System.out.println("\n The list is empty");
        }
        else {
            System.out.println("\n Your current list: ");
            for (String i:menuList) {
                counter++;
                System.out.println(counter + ": " + i);
            }
        }
    }
}