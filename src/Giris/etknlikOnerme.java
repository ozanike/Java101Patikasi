package Giris;
import java.util.Scanner;

public class etknlikOnerme {
    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Sıcaklık Değerini Giriniz:");
        heat = input.nextInt();

        if (heat < 5){
            System.out.print("Kayak Yapabilirsin...");

        }else if (heat >= 5 && heat <=25){
            if (heat <15){
                System.out.println("Sinemaya Gidebilirsin...");
            }
            if (heat >=10){
                System.out.print("Pikniğe Gidebilirsin...");
            }
        }else{
            System.out.println("Yüzmeye Gidebilirsin...");
        }

    }
}
