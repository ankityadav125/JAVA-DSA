package Numericals_100_Question;

import java.util.Scanner;

public class Ques37_CheckNumber_Is_PerfectSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num : ");
        int num= sc.nextInt();;
        int root=(int)Math.sqrt(num);
        System.out.println(num +(root*root ==num ? " is  perfect square":" is not"+" a perfect square"));
    }
}
