package Giris;

import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int min = 2147483647, max = -2147483648;

        System.out.print("Girmek İstediğiniz Sayı Adedi: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ".sayi: ");
            int n1 = input.nextInt();
            if (n1 > max) {
                max = n1;
            }
            if (n1 < min) {
                min = n1;

            }


        }
        System.out.print("Maximum Sayı: " + max + "\nMinimum Sayı: " + min);


    }
}
