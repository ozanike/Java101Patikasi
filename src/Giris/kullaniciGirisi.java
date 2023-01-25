package Giris;

import java.util.Objects;
import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {

        String userName, password, kontrol, newP1;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");

        } else {
            System.out.print("Bilgileriniz Yanlış! Şifrenizi Güncellemek İster Misiniz? Y/N :");
            kontrol = input.nextLine();
            if (kontrol.equals("Y") || kontrol.equals("y")) {
                System.out.print("Yeni Şifrenizi Giriniz: ");
                newP1 = input.nextLine();
                if (newP1.equals("java123")){
                    System.out.println("Şifre oluşturulamadı lütfen başka bir şifre giriniz.");
                }else {
                    password = newP1;
                    System.out.println("Şifreniz Oluşturuldu...\nŞifreniz:"+password);
                }

            }else {
                System.out.print("Şifreniz Güncellenmedi !");
            }


        }
    }
}
