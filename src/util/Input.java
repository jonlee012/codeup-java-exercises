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

}



