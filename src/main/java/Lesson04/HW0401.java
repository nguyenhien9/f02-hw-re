package Lesson4;

import java.util.Scanner;

public class HW0401 {
    public static void main(String[] args) {
        exercise01();
    }
    public static void exercise01(){
        Scanner sc = new Scanner(System.in);
        int countPositive = 0;
        int countNegative = 0;
        int sum = 0;
        int count = 0; // numbers input already
        while(true) {
            System.out.println("Enter a number (stop program if number = 0): ");
            int number = sc.nextInt();

            if (number == 0) {
                break;
            }
            if (number >0){
                countPositive++;
            }else{
                countNegative++;
            }
            sum += number;
            count++;
        }
        sc.close();
        if (count == 0){
            System.out.println("Nothing to calculate");
        }else{
            double average = (double) sum / count;
            System.out.println("Count of positive numbers: " + countPositive);
            System.out.println("Count of negative numbers: " + countNegative);
            System.out.println("Sum of numbers: " + sum);
            System.out.println("Average: " + average);
        }
    }
}
