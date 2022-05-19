import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

        int i = 100;


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