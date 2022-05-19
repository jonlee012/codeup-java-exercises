import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        String userInput;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hey, I'm Bob. I'm Jon.\n");
            userInput = scanner.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Woah, chill out!");
            } else if (userInput.equals("")) {
                System.out.println("Fine, be that way!");
            } else {
                System.out.println("Whatever.");
            }
        }while(!userInput.equals("bye"));
    }
}