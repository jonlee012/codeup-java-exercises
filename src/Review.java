import org.w3c.dom.ls.LSOutput;
import shapes.Circle;

public class Review {

//    question 1
    private static double radius;
    public void Circle(double radius) {
        this.radius = radius;
    }
    public static double getCircumference() {
        radius = 2.0;
        return 2 * Math.PI * radius;
    }

//question 2
    private static double bill;
    private static double tipPercentage;
    public static double total(double bill, double tipPercentage) {
    double total = (double) 0.0;
       total = bill + ((tipPercentage / 100) * bill);
       return total;
//        radius = 2.0;
//        return 2 * Math.PI * radius;
    }


//    question 3
public static int even(int [] numArr) {
    int evenNums[];
    for(int i=0;i<numArr.length;i++){
        if(numArr[i]%2==0){
            System.out.println(numArr[i]);
        }
        evenNums[].push(numArr[i]);

    }
    return evenNums;

//        radius = 2.0;
//        return 2 * Math.PI * radius;
}
//public class EvenInArray{
//    public static void main(String args[]){
//        int a[]={};
//
//        System.out.println("Even Numbers:");
//        for(int i=0;i<a.length;i++){
//            if(a[i]%2==0){
//                System.out.println(a[i]);
//            }
//        }
//    }
//    }
//    question 4

    public static void main(String[] args) {

//        question 1
        System.out.println(getCircumference());

//        question 2
        System.out.println(total(2.0, 2.0));

//          question 3


//          question 4


    }


}
