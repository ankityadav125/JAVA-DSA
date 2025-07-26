package Numericals_100_Question;

public class Ques04_SumOfFirst_N_numbers {
    public static void main(String[] args) {
        int sum=0,n=10;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("the sum of " +n+ " numbers are : " +sum);
    }
}
