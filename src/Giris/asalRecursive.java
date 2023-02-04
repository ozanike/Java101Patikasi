package Giris;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class asalRecursive {

    static void isAsal(int a) {
        int sayac = 0;
        for (int i = 2; i<a;i++){
            if(a % i == 0){
                sayac++;
            }

        }if(sayac == 0){
            System.out.println(a+ " sayısı ASALDIR !");
        }else{
            System.out.println(a+ " sayısı ASAL değildir !");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int a = scan.nextInt();
        isAsal(a);



    }
}
