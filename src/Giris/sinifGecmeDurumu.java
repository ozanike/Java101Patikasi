package Giris;
import java.util.Scanner;

public class sinifGecmeDurumu {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik, i=0;
        double avarage = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();
        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();
        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        if (0<=mat && mat<=100){
            avarage += mat;
            i++;
        } if (0<=fizik && fizik<=100){
            avarage += fizik;
            i++;
        } if (0<=kimya && kimya<=100){
            avarage += kimya;
            i++;
        } if (0<=turkce && turkce<=100){
            avarage += turkce;
            i++;
        } if (0<=muzik && muzik<=100){
            avarage += muzik;
            i++;
        }


       if (avarage/i < 55) {
           System.out.println("Sınıfta Kaldınız!");
       }else {
           System.out.println("Sınıfı Geçtiniz!");
       }System.out.println("Notunuz:" + avarage/i);
    }
}
