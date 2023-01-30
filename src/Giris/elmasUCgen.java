package Giris;

import java.util.Scanner;

public class elmasUCgen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısı Giriniz :");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int l = 1; l <= n - 1; l++) {
            for (int m = 1; m <= (n * l) / 5; m++) {
                System.out.print(" ");
            }

            for (int x = 1; x <= (2* (n - l)- 1); x++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
