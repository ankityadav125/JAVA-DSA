package Numericals_100_Question;

public class Ques05_SumOf_Digits_Numbers {
    public static void main(String[] args) {
        int num=251025, rem=0,sum=0,temp;
        temp=num;
        while (num > 0) {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum of digits of "+temp+ " is " +sum);
    }
}
