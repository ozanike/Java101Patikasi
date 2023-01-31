package Giris;
import java.util.Scanner;
public class mukemmelSayi {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        int number = input.nextInt();

        for (int i = 1; i<number; i++){
            if(number % i == 0){
                sum += i;
            }
        }if(sum == number){
            System.out.println(number + " bir mükemmel sayıdır.");
        }else {
            System.out.println(number + " bir mükemmel sayı değildir.");
        }


    }
}
