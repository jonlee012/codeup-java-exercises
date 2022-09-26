import java.util.Scanner;

public class ReverseSplit {

    public static void main(String[] args) {
//        set a str variable
        String str;
//        scanner to receive user input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your String");
//        assign scanner input to str
        str = in.nextLine();
//        split the string with built in method
        String[] token = str.split("");
//        in reverse
        for(int i = token.length-1; i >= 0; i--) {
            System.out.print(token[i] + " ");
        }
//        split normal
        for(int i=0; i < token.length; i++) {
            System.out.print(token[i] + " ");
        }
    }
}
