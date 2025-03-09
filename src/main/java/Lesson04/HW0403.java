package Lesson4;

import java.util.Scanner;

public class HW0403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentCounts;
        do {
            System.out.println("Enter number of students: ");
            while (!sc.hasNextInt()) {
                System.err.println("Must be an integer! Try again!");
                sc.nextLine();
            }
            studentCounts = sc.nextInt();
            sc.nextLine();
            if (studentCounts < 2) {
                System.err.println("Number of students must be >=2");
            } else {
                findSecondLargestStudent(sc, studentCounts);
            }

        } while (studentCounts < 2);
        sc.close();
    }

    public static void findSecondLargestStudent(Scanner sc, int n) {
        String maxScoreName = "", secondScoreName="";
        double maxScore= -1, secondScore=-1;

        for (int i = 1; i <= n ; i++) {
            System.out.printf("Name of student %d: ",i);
            String name = sc.nextLine();
            System.out.printf("Score of student %d: ",i);
            while (!sc.hasNextDouble()){
                System.err.println("Score cannot be a string! Try again");
                sc.nextLine();
            }
            double score = sc.nextDouble();
            sc.nextLine();
            if (score > maxScore){
                secondScore = maxScore;
                maxScore = score;
                secondScoreName= maxScoreName;
                maxScoreName= name;
            } else if(score > secondScore && score != maxScore){
                secondScore = score;
                secondScoreName= name;
            }

        }
        sc.close();
        System.out.printf("The largest score is : %s with %.2f\n", maxScoreName,maxScore);;
        System.out.printf("The second largest score is : %s with %.2f", secondScoreName,secondScore);
    }
}
