package Giris;

import java.util.Scanner;

public class ebobEkokWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz: ");
        int n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        int n2 = input.nextInt();
        int i = 1;
        int ebob = 0;
        int ekok;

        if (n1 < n2) {
            while (i <= n1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
        } else {
            while (i <= n2) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
        }
        ekok = ((n1 * n2) / ebob);
        System.out.println("EBOB: "+ebob);
        System.out.println("EKOK: "+ekok);


    }
}
