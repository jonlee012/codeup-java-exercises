import java.util.Scanner;

public class FizzBuzz {

        public static void main (String args[]){
//            System.out.println("Enter any valid number : ");
//            Scanner in = new Scanner(System.in);
//            Integer input = in.nextInt();

            int input = 50;
            for (int i = 1; i <= input; i++) {
                if (i % 3 == 0 && i % 5 == 0)// Check multiple of 3 and 5
                    System.out.print("FizzBuzz");
                else if (i % 3 == 0)// Check multiple of 3
                    System.out.print("Fizz");
                else if (i % 5 == 0)// Check multiple of 5
                    System.out.print("Buzz");
                else
                    System.out.print(i);// Not a multiple of 3 and 5
                System.out.print(" ");
            }
        }
    }
