import java.util.Arrays;

public class Warmups {
    //    Let's create a method that returns
//    the sum of all integers in an int array (nums)
    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        int sum = 0;
//        for (int i : numbers)
//        sum += i;
//        System.out.println(numbers);
//        System.out.println(sum);


//        for (int n : numbers) {
//            count += n;
//            System.out.println(n);
//        }
//        return Arrays.stream(numbers).sum();
//        System.out.println(numbers);
        System.out.println(sumAll());
//        System.out.println(language);
//        System.out.println(forLoops());
        System.out.println(spaceNumbers([1, 3, 5, 6]));
    }
    public static int spaceNumbers(int numArr){
        for(int i = 0; i < numArr; i++){
            System.out.print(" ");
        }

        return numArr;
    }
    //    new method
//    create new method
    public static int sumAll() {
//        int[] nums = {1, 2, 3, 4, 5};
//        int sum = 0;
//        for (int num : nums)
//            System.out.println(num);
//            sum += num;
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i : numbers)
            sum += i;
        return sum;
//        System.out.println(numbers);
    }
//        System.out.println(sum);
//    public static String language() {
//        String[] languages = {
//                "french",
//                "chinese",
//                "italian"
//        };
////        Arrays.sort(languages);
////        System.out.println(Arrays.toString(languages));
//
//        return null;
//    }
//    public static int forLoops(){
//    int [][] myMatrix = {
//            {1,2,3},
//            {4,5,6},
//            {7,8,9}
//    };
//        for(int[] nums : myMatrix){
////            int nums = 0;
//            System.out.println(Arrays.toString(nums));
//        }
////        return myMatrix;
//    }

}
