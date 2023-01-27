package Giris;

import java.util.Scanner;

public class basamakSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int number = input.nextInt();
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basSayisi = 0;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basSayisi++;

        }


        tempNumber = number;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;

            for(int i = 1; i<= basSayisi;i++){
            }
            result += basValue;
            tempNumber /= 10;
        } System.out.println(+number+" sayısının basamakları toplamı =" +result);


    }


}

