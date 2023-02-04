package Giris;

public class palindromNumber {

    static boolean isPalindrom(int number){

        int temp = number;
        int reverseNumber = 0;
        int lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10; //son basamağı almak için
            reverseNumber = (reverseNumber * 10) + (lastNumber);//sayıyı tersten oluşturmak için
            temp /= 10;//döngüyü sonlandırmak ve sayının diğer basamaklarını almak için


        }
        if (reverseNumber == number){
            return true;
        }else {
            return false;
        }

    }
    public static void main(String[] args) {

        System.out.println(isPalindrom(9889));

    }
}
