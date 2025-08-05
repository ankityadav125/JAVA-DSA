package Numericals_100_Question;

public class Ques18_SwapTwoNumber_WithoutUsing_ThirdVariables {
    public static void main(String[] args) {
        int a=10,b=20,temp=a;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a=" +a+ " b="+b);
    }
}
