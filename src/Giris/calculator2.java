package Giris;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calculator2 {

    static void plus() {
        Scanner input = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ".Sayı :");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç = " + result);
    }

    static void minus() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = input.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner input = new Scanner(System.in);
        int number, result = 1, i = 1;
        while (true) {
            System.out.println(i++ + ".Sayı: ");
            number = input.nextInt();
            if (number == 1) {
                break;
            }
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;

        }
        System.out.println("Sonuç = " + result);

    }

    static void divided() {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç Adet Sayı Gireceksiniz: ");
        int counter = input.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.println(i + ".Sayı :");
            number = input.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 Giremezsiniz!");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç = " + result);
    }

    static void power() {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz: ");
        int a = input.nextInt();
        System.out.print("Üs Değerini Giriniz: ");
        int b = input.nextInt();
        int result = 1;

        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Sonuç = " + result);
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int a = input.nextInt();
        int result = 1;

        for (int i = 1; i <= a; i++) {

            result *= i;
        }
        System.out.println("Sonuç = " + result);
    }

    static void mod() {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        int a = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        int b = input.nextInt();
        int result;
        result = (a % b);
        System.out.println("Sonuç = " + result);
    }

    static void alanCevre() {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Kenarı Giriniz: ");
        int a = input.nextInt();
        System.out.print("İkinci Kenarı Giriniz: ");
        int b = input.nextInt();
        int alan, cevre;

        alan = (a * b);
        cevre = (2 * (a + b));

        System.out.println("Alan = " + alan + "\nÇevre = " + cevre);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen Bir İşlem Seçiniz :");
            select = input.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    alanCevre();
                    break;
                case 0:
                    System.out.println("Programdan Çıkılıyor...");
                    break;
                default:
                    System.out.println("Yanlış Bir Değer Girdiniz, Tekrar Deneyiniz!");


            }
        } while (select != 0);

    }


}

