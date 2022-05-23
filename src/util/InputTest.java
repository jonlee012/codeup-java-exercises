package util;

public class InputTest {
    public static void main(String[] args) {
//        System.out.println(getString());
        Input in = new Input();
        System.out.println("Give me a string!");
        String storedString = in.getString();

        System.out.println(storedString);

        System.out.println("yes or no? (yes/no)");
        Boolean myChoice = in.yesNo();

        System.out.println(myChoice);
        System.out.println("Give me a double");

        double doubleNum = in.getDouble();
        System.out.println(doubleNum);

        //New Tests

        Input test = new Input();
        test.getInt(1, 20);
        test.getDouble(1, 20);


    }
    }

