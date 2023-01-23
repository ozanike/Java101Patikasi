package Giris;

import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        double n1, n2;
        int select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayı: ");
        n1 = input.nextDouble();
        System.out.print("İkinci Sayı: ");
        n2 = input.nextDouble();
        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        System.out.print("Seçiminizi Giriniz: ");
        select = input.nextInt();

        switch (select) {

            case 1:
                System.out.print(n1 + "+" + n2 + "=" + (n1 + n2));
                break;
            case 2:
                System.out.print(n1 + "-" + n2 + "=" + (n1 - n2));
                break;
            case 3:
                System.out.print(n1 + "*" + n2 + "=" + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.print(n1 + "/" + n2 + "=" + (n1 / n2));

                } else {
                    System.out.println("Bir Sayı Sıfıra Bölünemez.Lütfen Tekrar Deneyin.");
                }
                break;

            default:
                System.out.println("Lütfen Geçerli Bir Seçim Yapınız...");
                break;
        }
    }
}

