package shapes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsLecture {
    public static void main(String[] args) {






        int [] numbers = {1,2,3,4};
        ArrayList<Integer> collectionOfNums = new ArrayList<>(Arrays.asList(numbers[0], numbers[1], numbers[2], numbers[3]));
        collectionOfNums.add(16);
        collectionOfNums.add(2);
        collectionOfNums.add(5);
        collectionOfNums.add(30);
        collectionOfNums.add(22);
        for (Integer num : collectionOfNums){
//            System.out.println(num);
            if (num > 10){
//                System.out.println(num);
            }
        }
        System.out.println(numbers);
        System.out.println(collectionOfNums);
        List<Square> squares = new ArrayList<>();
        Square specialOne = new Square(4);
        squares.add(specialOne);
//        System.out.println(squares.contains(specialOne));
        squares.add(new Square(8));
        System.out.println(squares.contains(new Square(8)));
        }

}
