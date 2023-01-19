package Giris;
import java.util.Scanner;

public class ucgenAlan {
    public static void main(String[] args) {

        //Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        //𝑢 = (a+b+c) / 2
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

        int a, b, c;
        double u,alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin 1.Kenarını Giriniz:");
        a = input.nextInt();
        System.out.print("Üçgenin 2.Kenarını Giriniz:");
        b = input.nextInt();
        System.out.print("Üçgenin 3.Kenarını Giriniz:");
        c = input.nextInt();

        u = (a + b + c) / 2.0;
        alan = Math.sqrt((u * (u-a) * (u-b) * (u-c)));

        System.out.println("Üçgeninizin Alanı:" + alan);




    }
}
