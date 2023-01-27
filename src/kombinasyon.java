import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        /*
        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)
         */

        int n, r, sumN = 1, sumR = 1, sumNr = 1;
        double c;


        Scanner input = new Scanner(System.in);
        System.out.print("Eleman Sayısı(n):");
        n = input.nextInt();
        System.out.print("Farklı Grup Sayısı(r):");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            sumN *= i;
        }

        for (int j = 1; j <= r; j++){
            sumR *= j;
        }

        for (int k = 1; k<=(n-r);k++){
            sumNr *= k;
        }

        c = (sumN) / (sumR * sumNr);

        System.out.println("C("+n+","+r+") = " +c);


    }
}
