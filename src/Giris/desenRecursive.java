package Giris;
import java.util.Scanner;
public class desenRecursive {

    static void desen(int a, int b, boolean c){

        if(a <= 0){
            c = false;
            System.out.print(a + " ");

        }if (a > 0 && c == true){
            System.out.print(a + " ");
            desen(a-5,++b,c);
        }else{
            System.out.print(a + " ");
            if (b == 0){
                return;
            }
            desen(a+5,--b,c);
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı Giriniz:");
        int a = scan.nextInt();
        desen(a,0,false);

    }
}
