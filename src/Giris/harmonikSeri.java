package Giris;
import java.util.Scanner;

public class harmonikSeri {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = input.nextInt();
        double result = 0;

        for(int i = 1; i<=n; i++){
            result += (1.0/i); //double/int veya int/double işlem girilmezse java sonucun sadece int.kısmını döndürüyor.

        }
        System.out.println(result);


    }
}
