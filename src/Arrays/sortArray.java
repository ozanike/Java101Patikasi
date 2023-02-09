package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class sortArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu girin:");
        int n = input.nextInt();
        int [] list = new int[n];
        System.out.println("Dizinin Elemanlarını Girin:");
        for(int i = 0; i<n;i++){
            System.out.print(i+1 + ". Elemanı: ");
            int b = input.nextInt();
            list[i] = b;

        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));



    }
}
