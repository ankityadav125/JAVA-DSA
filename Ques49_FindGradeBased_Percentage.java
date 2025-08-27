package Numericals_100_Question;

import java.util.Scanner;

public class Ques49_FindGradeBased_Percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks:");
        int marks= sc.nextInt();
        if(marks>=90){
            System.out.println("A");
        } else if (marks>=80) {
            System.out.println("B");
        } else if (marks>=70) {
            System.out.println("C");
        } else if (marks>=60) {
            System.out.println("D");
        } else {
            System.out.println("Fail");
        }
    }
}
