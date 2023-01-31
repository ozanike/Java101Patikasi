package Giris;

import java.util.Scanner;

public class asalSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi Sonundaki Sayıyı Giriniz: ");
        int n = input.nextInt();

        while (n < 2) ;
        boolean asalMi = true;
        for (int i = 2; i < n; i++) {

            for (int j = 2; j < i; j++) {
                if (!(i % j == 0)) asalMi = true;
                else {
                    asalMi = false;
                    break;
                }
            }
            if (asalMi) System.out.print(i + " ");

        }

    }
}
