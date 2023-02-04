package Giris;
import java.util.Scanner;

public class powerRecursive {
    static int power(int a, int b) {

        if (a == 1 || b == 0) {
            return 1;
        }

        return a *= power(a,b-1);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Sayısı: ");
        int a = input.nextInt();
        System.out.print("Üs Olacak Sayı: ");
        int b = input.nextInt();

        System.out.println(power(a,b));


    }
}
