public class FizzBuzzNew {

    public static void main(String[] args) {
//        sort through a list of 100 and find numbers that are
//        divisble by 3 will print out fizz
//        divisible by 5 will print out buzz
//        divisble by 3 and 5 will print out fizzbuzz
        int number = 100;
        for (int i = 1; i <= number; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0){
                System.out.println("fizz");
            } else if (i % 5 == 0){
                System.out.println("buzz");
            } else{
                System.out.println(i);
            }
        }



    }
}
