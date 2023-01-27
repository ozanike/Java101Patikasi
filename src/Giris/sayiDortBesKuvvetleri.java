package Giris;

import java.util.Scanner;

public class sayiDortBesKuvvetleri {
    public static void main(String[] args) {
        int i = 1, j = 1, n;

        Scanner input = new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz: ");
        n = input.nextInt();

        do {
            i *= 4;
            j *= 5;
            System.out.println("Dördün Kuvveti: " + i);
            System.out.println("Beşin Kuvveti: " + j);

        } while (n > i && n > j);


    }
}
