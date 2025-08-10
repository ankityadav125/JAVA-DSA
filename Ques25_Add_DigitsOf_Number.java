package Numericals_100_Question;

import java.util.Scanner;

public class Ques25_Add_DigitsOf_Number {
    public static void main(String[] args) {
        int num=1234,sum=0;
        while (num > 0) {
            sum=sum+num%10; //sum+=num%10
            num=num/10;   //num/=10
        }
        System.out.println("Sum of Digits is : "+sum);
    }
}
