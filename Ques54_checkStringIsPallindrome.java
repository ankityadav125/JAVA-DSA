package Numericals_100_Question;

public class Ques54_checkStringIsPallindrome {
    public static void main(String[] args) {
        String input="mam";
        String reversed=new StringBuilder(input).reverse().toString();
        System.out.println("Is pallindrome :"+input.equals(reversed));
    }
}
