import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        //arrays.tostring is necesssary to print all elements
        System.out.println(Arrays.toString(numbers));

        String[] persons = {"Jon Jones", "Holy Moly", "Selma Smith"};
        for (String person : persons) {
            System.out.println(person);
        }
        String[] people = Arrays.copyOf(persons, 4);
//        add in a new person to existing array
        people[3] = "Busta Rhymes";
        System.out.println(Arrays.toString(people));

//    public static void numArr(){
//
//
//    }

    }
    String  person;
    public  void addPerson (String name) {
        person = name;
    }
}