package Numericals_100_Question;

import java.util.Scanner;

public class Ques48_CheckNumberIs_DIvisibleBy_3and5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num: ");
        int num=sc.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println(num+" is divided by 3 and 5");
        }else {
            System.out.println("Number is not divided by both");
        }
    }
}
