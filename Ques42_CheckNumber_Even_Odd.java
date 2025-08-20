package Numericals_100_Question;

import java.util.Scanner;

public class Ques42_CheckNumber_Even_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num: ");
        int num= sc.nextInt();;
        if(num%2==0){
            System.out.println("Even");
        } else{
            System.out.println("odd");
        }
    }
}
