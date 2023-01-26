package Giris;
import java.util.Scanner;

public class ucakBiletiHesaplama {
    public static void main(String[] args) {
        int km, age, yolculukTipi;
        double kmUcret = 0.10, biletTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi Km Türünden Giriniz: ");
        km = input.nextInt();
        System.out.print("Yaşınızı Giriniz: ");
        age = input.nextInt();
        System.out.print("Yolculuk Tipini Giriniz:\n1-->Tek Yön\n2-->Gidiş-Geliş:");
        yolculukTipi = input.nextInt();

        if ((km > 0 && age > 0) && (yolculukTipi == 1 || yolculukTipi == 2)) {
            if (yolculukTipi == 1 && age < 12) {
                biletTutar = ((km * kmUcret) * 0.50);
                System.out.println("Bilet Tutarınız: " + biletTutar + " TL");
            } else if ((yolculukTipi == 1) && (12 < age && age < 24)) {
                biletTutar = ((km * kmUcret) * 0.90);
                System.out.println("Bilet Tutarınız: " + biletTutar + " TL");
            } else if ((yolculukTipi == 1) && (age > 65)) {
                biletTutar = ((km * kmUcret) * 0.30);
                System.out.println("Bilet Tutarınız: " + biletTutar + " TL");
            } else if (yolculukTipi == 2 && age < 12) {
                biletTutar = (0.80 * (2 * (km * kmUcret) * 0.50));
                System.out.println("Bilet Tutarınız: " + biletTutar + " TL");
            } else if ((yolculukTipi == 2) && (12 < age && age < 24)) {
                biletTutar = (0.80 * (2 * (km * kmUcret) * 0.90));
                System.out.println("Bilet Tutarınız: " + biletTutar + " TL");
            } else if ((yolculukTipi == 2) && (age > 65)) {
                biletTutar = (0.80 * (2 * (km * kmUcret) * 0.70));
                System.out.println("Bilet Tutarınız: " + biletTutar + " TL");
            } else {
                if (yolculukTipi == 1) {
                    biletTutar = (km * kmUcret);
                    System.out.println("Bilet Tutarınız: " + biletTutar + " TL");
                } else {
                    biletTutar = (2 * (km * kmUcret));
                    System.out.println("Bilet Tutarınız: " + biletTutar + " TL");
                }
            }

        } else {
            System.out.println("Hatalı Veri Girişi!");
        }
    }
}
