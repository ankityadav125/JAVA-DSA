package Numericals_100_Question;

import java.util.Scanner;

public class Ques47_CheckEligibility_TO_Vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age :");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("You can vote");
        } else {
            System.out.println("You can not vote");
        }
    }
}
