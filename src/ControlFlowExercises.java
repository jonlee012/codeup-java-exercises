import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

        int i = 100;



        //create a do-while loop that starts at 2 and displays the number squared on each line
        //while new number is less than 1,000,000
//            // long y = 2L;
//            do {
//
//              System.out.println(y);
        //y *= y;
//            }while (i < 1000000L);

        //do a for loop now
//        for (double y = 2; i <= 1000000; i++){
//            if (i <= 1000000){
//                Double xy = (Double) Math.sqrt(i);
//                System.out.println("i is: " + xy);
//            }
//        }

        Scanner sc = new Scanner(System.in);

        //convert number grades into letter grades (From 0-100)
        System.out.println("Would you like to look at your letter grades?");
        String confirm = sc.next();

        while (confirm.equalsIgnoreCase("YES")) {
            System.out.println("What was your numeric grade?");
            int grade = sc.nextInt();

            char letterGrade;
            if (grade > 100)  {
                System.out.println("Max numerical grade is less than 100");
                continue;
            } else if (grade >= 90) {
                letterGrade = 'A';
            } else if (grade >= 80) {
                letterGrade = 'B';
            } else if (grade >= 70) {
                letterGrade = 'C';
            } else if (grade >= 60) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

            System.out.printf("Congratulations you got a %c.%n", letterGrade);

            System.out.println("Would you like to look at your letter grades?");
            confirm = sc.next();
        }


    }
}