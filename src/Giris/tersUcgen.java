package Giris;
import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Basamak Sayısı Giriniz: ");
        int basamak = input.nextInt();

        for (int i = 0; i< basamak;i++){
            for (int j = 1; j<=i;j++ ){
                System.out.print(" ");
            }
            for (int k = 1; k<=((2*(basamak-i)-1)); k++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
