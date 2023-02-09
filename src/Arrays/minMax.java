package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class minMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        int a = input.nextInt();

        int[] list = {15,12,788,1,-1,-778,2,0,a};
        Arrays.sort(list);

        int min = list[0];
        int max = list[8];
        int result;

        result = Arrays.binarySearch(list,a);

        min = list[result-1];
        max = list[result+1];

        System.out.println(+a + " En yakın küçük sayı:" + min);
        System.out.println(+a + " En yakın büyük sayı:" + max);









    }
}
