import java.util.Scanner;

class Abhi {
    public static void main(String[] args) {
        int num = 5;
        int num1 = 1;
        for (int e = 1; e <= num; e++) {
            for (int i = 1; i <= (num - num1); i++) {
                System.out.print(" ");
            }
            for (int q = 1; q <= num1; q++) {
                System.out.print(num1);
                if (num1 != 1) {
                    System.out.print(" ");
                 }
            }
            num1++;
            for (int w = 0; w <= (num - num1); w++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}