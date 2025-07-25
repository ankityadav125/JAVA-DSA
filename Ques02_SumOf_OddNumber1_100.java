package Numericals_100_Question;

public class Ques02_SumOf_OddNumber1_100 {
    public static void main(String[] args) {
        int sum=0,i;
        for(i=1;i<=100;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println(" the sum of 100 odd number is : "+sum);
    }
}
