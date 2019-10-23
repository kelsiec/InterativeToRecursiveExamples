import java.util.Scanner;

public class PromptForInteger {

    public static int promptUserForInteger() {
        Scanner in = new Scanner(System.in);
        Integer inputAsInt = null;
        System.out.println("Please enter a whole number.");
        String userInput = in.nextLine();
        try {
            inputAsInt = Integer.valueOf(userInput);
            return inputAsInt;
        } catch (NumberFormatException e) {
            System.out.println(userInput + " is not a whole number!");
            return promptUserForInteger();
        }
    }

    public static void main(String[] args) {
        System.out.println("You finally entered " + promptUserForInteger());
    }
}
