public class StringExercise {

    public static void main(String[] args) {

        //1

        String firstString = "We don't need no education \n";
        System.out.println(firstString  + firstString.replace("no education", "no thought control"));

        //2

        String secondString = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(secondString);

        //3

        String thirdString = "In windows, the main drive is usually C:\\";
        System.out.println(thirdString);

        //4

        String fourthString = "I can do backslashes \\, double backslashes \\\\,\n" + "and the amazing triple backslash \\\\\\!";
        System.out.println(fourthString);

    }

}