package Lesson4;

public class HW0404 {
    public static void main(String[] args) {
        exercise04(100, 200, 5, 6);
    }

    public static void exercise04(int start, int end, int a, int b) {;
        System.out.printf("\n+---- Numbers are divisible by %d and not divisible by %d ----+\n", a, b);
        boolean isDivisibleBy5 = false;
        for (int i = start; i <= end; i++) {
            if (i % a == 0 && i % b != 0) {
                System.out.print(i + " ");
                isDivisibleBy5 = true;
            }
        }
        if (!isDivisibleBy5) {
            System.out.printf("No numbers are divisible by %d", b);
        }
        System.out.printf("\n+---- Numbers are divisible by %d and not divisible by %d ----+\n", b, a);
        boolean isDivisibleBy6 = false;
        for (int i = start; i <= end; i++) {
            if (i % b == 0 && i % a != 0) {
                System.out.print(i + " ");
                isDivisibleBy6 =true;
            }
        }
        if (!isDivisibleBy6) {
            System.out.printf("No numbers are divisible by %d", b);
        }
        System.out.printf("\n+---- Numbers invalid (are divisible by %d and %d) ----+\n", a, b);
        for (int i = start; i <= end ; i++) {
            if (i % a == 0 && i % b == 0){
                System.out.print(i + " ");
            }
        }
    }
}
