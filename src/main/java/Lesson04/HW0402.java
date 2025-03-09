package Lesson4;

public class HW0402 {
    public static void main(String[] args) {
        tuitionFee();
    }

    public static void tuitionFee() {
        double tuition = 10000;
        double rate = 0.05;
        double totalTuition = 0;

        // next 10 years
        for (int year = 1; year <= 14; year++) {
            tuition += tuition * rate;
            if (year <= 10){
                System.out.printf("Year %d: %.2f USD%n",year,tuition);
            }
            if (year >= 11){
                totalTuition += tuition;
            }
        }
        System.out.printf("Total tuition from year 11 to 14 = %.2f%n",totalTuition);
    }
}
