package Numericals_100_Question;

import java.util.Scanner;

public class Ques38_Check_NumberIsDividedBy5or11_Or_Both {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num : ");
        int num= sc.nextInt();;
        System.out.println(num +((num%5==0 && num%11==0)? " is" :" is not")+" divided by 5 and 11");
    }
}
