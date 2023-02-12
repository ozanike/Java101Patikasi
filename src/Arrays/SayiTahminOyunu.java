package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;//random sınıfını kütüphanemize dahil ettik.
import java.util.Scanner;;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        //int number = (int) (Math.random()*100); //double bir değeri integere'a çeviriyoruz.
        Random rand = new Random(); //random sınıfından bir nesne ürettik.
        int number = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        int right = 0; //kullanıcının hakları
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;


        System.out.println(number);


        while (right < 5) {
            System.out.print("Lütfen Tahmininizi Giriniz: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 Arasında Bir Sayı Giriniz!");
                if(isWrong){
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan Hak: " + (5 -right));
                }
                else{
                    isWrong = true;
                    System.out.println("Bir daha ki hatalı girişinizde hakkınızdan düşülecektir.");
                }

                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler Doğru Tahmin Ettiniz. Sayınız: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı Bir Sayı Girdiniz!");
                if (selected < number) {
                    System.out.println("Gizli Sayı Girdiğiniz Sayıdan Büyüktür!");
                } else {
                    System.out.println("Gizli Sayınız Girdiğiniz Sayıdan Küçüktür!");
                }

                wrong[right] = selected;
                right++;
                System.out.println("Kalan Hakkınız:" + (5 - right));
            }

        }

        if (!isWin) {
            System.out.println("Kaybettiniz!");

            if(!isWrong){
                System.out.println("Tahminleriniz =" + Arrays.toString(wrong));
            }
        }
    }
}
