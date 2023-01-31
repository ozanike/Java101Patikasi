package Giris;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int sum = 0;
        int a = 0;
        int b = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci Dizisi Eleman Sayısı: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            sum = a + b ;
            a = b;
            b = sum;



        }
    }
}
