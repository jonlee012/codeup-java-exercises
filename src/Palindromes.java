
public class Palindromes {
    public static void main(String[] args) {
        String original = "race car";
        original = original.replace(" ", "");
        String reverse = "";

    for (int i= original.length() -1; i>=0; i--){
        reverse += original.charAt(i);
//        System.out.println(reverse);
    }
    boolean palindrome = true;
    for (int i =0; i < original.length(); i++){
//        System.out.println(original.charAt(i));
       if (original.charAt(i) != reverse.charAt(i)){
           palindrome = false;
       }
    }
    if(palindrome){
        System.out.println("palindrome");
    }else{
        System.out.println("not a palindrome");
    }
    }
}
