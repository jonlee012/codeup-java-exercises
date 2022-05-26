import shapes.Circle;
//import shapes.Circle1;
import shapes.Square;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class CollectionsLecture {
    public static void main(String[] args) {
// We'll start by defining an array list and adding some items to it
        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");
        System.out.println(roasts.indexOf("light"));
        System.out.println(roasts); // [light, medium, medium, dark]

// using .contains
        roasts.contains("dark"); // true
        roasts.contains("espresso"); // false

// using .lastIndexOf
        roasts.lastIndexOf("medium"); // 2

// using .isEmpty
        roasts.isEmpty(); // false
        ArrayList<String> emptyList = new ArrayList<>();
        emptyList.isEmpty(); // true

// .remove has two variants
        roasts.remove("espresso"); // false
        roasts.remove("medium"); // true
        System.out.println(roasts); // [light, medium, dark]

        roasts.remove(2); // "dark"
        System.out.println(roasts); // [light, medium]





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

        HashMap<Character, Circle> circles = new HashMap<>();
        circles.put('A', new Circle(3));
        Circle specialCircle = new Circle(6);
        circles.put('B', specialCircle);
        System.out.println(circles);
    }
}
