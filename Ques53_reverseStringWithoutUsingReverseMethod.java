package Numericals_100_Question;

import java.util.Scanner;

public class Ques53_reverseStringWithoutUsingReverseMethod {
    public static void main(String[] args) {
        String input="hello";
        String reverse="";
        for(int i=input.length()-1;i>=0;i--){
            reverse+=input.charAt(i);
        }
        System.out.println("Reversed : "+reverse);
    }
}


