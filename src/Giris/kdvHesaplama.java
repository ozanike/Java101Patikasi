package Giris;
import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
        double tutar, kdvliTutar, kdvMiktari, kdvOrani;

        Scanner input = new Scanner(System.in);

        System.out.print("Hesaplanacak Tutar:");
        tutar = input.nextDouble();
        kdvOrani = tutar > 1000 ? 0.08:0.18;

        kdvMiktari = (tutar * kdvOrani);
        kdvliTutar = (tutar + kdvMiktari);

        System.out.println("KDV'siz Tutar:" + tutar);
        System.out.println("KDV Miktarı:" + kdvMiktari);
        System.out.println("KDV Oranı:" + kdvOrani);
        System.out.println("KDV'li Tutar:" + kdvliTutar);



    }
}
