import java.util.Scanner;


public class ConsoleIO {

    public static void main(String args[]) {
        String name = "Jacob";

        System.out.printf("Hello there, %s. Nice to meet you. \n", name); // \n is a new line break

        String greeting = "Hello";
        String myName = "Jon";

        System.out.printf("%s, %s! ", greeting, myName);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");

        String userInput = scanner.nextLine();

        System.out.printf("You entered %s", userInput);


    }


}