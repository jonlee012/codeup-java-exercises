public class ExceptionsLecture {


    public static void main(String[] args) {
        try {
            //checked exception
            //pre built with java
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[999]);
        } catch (Exception e) {
//        System.out.println(numbers[1]);

            //custom exception
//        throw new Exception("Something bad happened!");
        System.out.println("doesn't work");
        }
    }
}