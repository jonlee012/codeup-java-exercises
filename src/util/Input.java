package util;
import java.util.Objects;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public String getString() {
        System.out.println("hello");
        return scanner.nextLine();
    }
    public Boolean yesNo(){
        if (Objects.equals(scanner.nextLine(), "yes")) {
            return true;
        } else {
            return false;
        }
    }
}

