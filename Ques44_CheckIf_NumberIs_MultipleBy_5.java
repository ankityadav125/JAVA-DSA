package Numericals_100_Question;

import java.util.Scanner;

public class Ques44_CheckIf_NumberIs_MultipleBy_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num : ");
        int num=sc.nextInt();
        if(num%5==0){
            System.out.println(num +" is multiple of 5");
        } else {
            System.out.println(num + " is not multi of 5");
        }
    }
}
