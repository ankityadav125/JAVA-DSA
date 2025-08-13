package Numericals_100_Question;

import java.util.Scanner;

public class Ques32_ConvertMinutesToHoursAndMinutes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total Minutes : ");
        int totalminutes=sc.nextInt();
        int hours=totalminutes/60;
        int minutes=totalminutes%60;
        System.out.println(hours + "hours " + minutes+ "minutes");
    }
}
