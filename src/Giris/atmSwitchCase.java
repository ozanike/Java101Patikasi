package Giris;

import java.util.Scanner;

public class atmSwitchCase {
    public static void main(String[] args) {
        String userName, password;
        int token = 3;
        int select;
        int balance = 5000;

        Scanner input = new Scanner(System.in);

        while (token > 0) {
            System.out.print("Kullanıcı Adınızı Giriniz: ");
            userName = input.nextLine();
            System.out.print("Parolanızı Giriniz: ");
            password = input.nextLine();
            if (userName.equals("ozanike") && password.equals("ozan123")) {

                do {
                    System.out.println("Kodluyoruz Bankasına Hoş Geldiniz!");
                    System.out.println(
                            "1.Para Yatırma\n" +
                                    "2.Para Çekme\n" +
                                    "3.Bakiye Sorgulama\n" +
                                    "4.Çıkış");
                    System.out.print("Yapmak İstediğiniz İşlemi Seçiniz: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak İstediğiniz Tutarı Giriniz:");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("İşleminiz Gerçekleşti.Güncel Bakiyeniz:" + balance +" TL");
                            break;
                        case 2:
                            System.out.print("Çekmek İstediğiniz Tutarı Giriniz:");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiyeniz Yetersiz!");
                            } else {
                                balance -= price;
                                System.out.println("İşleminiz Gerçekleşti.Güncel Bakiyeniz:" + balance+" TL");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance+" TL");
                            break;

                    }


                } while (select != 4);
                break;


            } else {
                token--;
                System.out.println("Kullanıcı Adınız veya Parolanız Hatalıdır.Tekrar Deneyiniz.");
                if (token == 0) {
                    System.out.println("Hesabınız Bloke Olmuştur.Lütfen Bankanız İle İletişime Geçiniz!");
                } else {
                    System.out.println("Kalan Hakkınız: " + token);
                }

            }

        }
    }
}