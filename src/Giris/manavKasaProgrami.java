package Giris;
import java.util.Scanner;

public class manavKasaProgrami {
    public static void main(String[] args) {
        //Armut : 2,14 TL
        //Elma : 3,67 TL
        //Domates : 1,11 TL
        //Muz: 0,95 TL
        //Patlıcan : 5,00 TL

        double Armut = 2.14, Elma = 3.67, Domates = 1.11, Muz = 0.95, Patlican = 5.00, tutar = 0.0;
        int kg;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo : ");
        kg = input.nextInt();
        Armut = kg * Armut;
        tutar += Armut;
        System.out.print("Elma Kaç Kilo : ");
        kg = input.nextInt();
        Elma = kg * Elma;
        tutar += Elma;
        System.out.print("Domates Kaç Kilo : ");
        kg = input.nextInt();
        Domates = kg * Domates;
        tutar += Domates;
        System.out.print("Muz Kaç Kilo : ");
        kg = input.nextInt();
        Muz = kg * Muz;
        tutar += Muz;
        System.out.print("Patlıcan Kaç Kilo : ");
        kg = input.nextInt();
        Patlican = kg * Patlican;
        tutar += Patlican;

        System.out.print("Toplam Tutar: " + tutar);



    }
}
