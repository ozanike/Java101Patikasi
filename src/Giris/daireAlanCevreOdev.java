package Giris;
import java.util.Scanner;

public class daireAlanCevreOdev {
    public static void main(String[] args) {
        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        //𝜋 sayısını = 3.14 alınız.
        //Formül : (𝜋 * (r*r) * 𝛼) / 360

        int r;
        double alfa, pi = 3.14, alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenizin Yarıçapını Giriniz: ");
        r = input.nextInt();
        System.out.print("Merkez Açı Ölçüsünü Giriniz: ");
        alfa = input.nextDouble();

        alan = (pi * (r * r) * alfa) / 360.0;

        System.out.print("Daire Diliminizin Alanı : " + alan);
}}
