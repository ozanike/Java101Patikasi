package Giris;
import java.util.Scanner;


public class notOrtalama {
    public static void main(String[] args) {
        //Değişkenleri oluştur.

        int mat, fizik, kimya, turkce, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz:");
        mat = inp.nextInt();
        System.out.print("Fizik Notunuzu Giriniz:");
        fizik = inp.nextInt();
        System.out.print("Kimya Notunuzu Giriniz:");
        kimya = inp.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz:");
        turkce = inp.nextInt();
        System.out.print("Tarih Notunuzu Giriniz:");
        int tarih = inp.nextInt();
        System.out.print("Müzik Notunuzu Giriniz:");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        String sonuc2 = sonuc > 60 ? "Sınıfı Geçtiniz":"Sınıfta Kaldınız";
        System.out.print("Not Ortalamanız:" + sonuc + " ");
        System.out.print(sonuc2);


    }
}
