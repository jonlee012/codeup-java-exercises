package util;
import java.util.Objects;
import java.util.Scanner;

public class Input {



    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("hello");
        return scanner.nextLine();
    }

    public Boolean yesNo() {
        if (Objects.equals(scanner.nextLine(), "yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.println("get lowest num: " + min + " and highest num: " + max);
        int newNum;
        newNum = this.scanner.nextInt();
        try {
            return Integer.parseInt((getString()));
        } catch (NumberFormatException e) {
            System.err.println("you've reach an error.");
        }
        if (newNum <= max && newNum >= min) {
            System.out.println("that's a valid number");
            return newNum;
        } else {
            System.out.println("please add a number between inputs");
            return getInt(min, max);
        }
    }

    public int getInt() {
        return scanner.nextInt();
    }
    public double getDouble(double min, double max) {
        System.out.println("Enter an integer between " + min + " and " + max);

        double userInput = this.scanner.nextDouble();

        try {
            return Double.parseDouble(getString());
        }
        catch (NumberFormatException e){
            System.err.println("ERROR: Not a valid input, try again.");
        }

        while (userInput <= min || userInput >= max) {
            System.out.println("Enter an integer between " + min + " and " + max);
            userInput = this.scanner.nextDouble();
        }

        System.out.println("Thank you for the valid number!");
        return userInput;
    }

    public double getDouble(){
        return scanner.nextDouble();
    }

}



