package Numericals_100_Question;

public class Ques03_TotalOdd_Number1_100 {
    public static void main(String[] args) {
        int count=0,i;
        for(i=1;i<=100;i++){
            if(i%2!=0){
                count++;
            }
        }
        System.out.println("the count of odd number are : " + count);
    }
}
