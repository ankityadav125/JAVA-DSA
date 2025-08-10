package Numericals_100_Question;

public class Ques26_Reverse_DigitsOf_Number {
    public static void main(String[] args) {
        int num=1234,rev=0;
        while (num>0){
            rev=rev*10+num%10;
            num=num/10;  //num/=10
        }
        System.out.println("Reverse of number is : " +rev);
    }
}
