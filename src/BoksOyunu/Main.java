package BoksOyunu;

import javax.crypto.MacSpi;

public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Ozan",10,120,100,30,50);
        Fighter f2 = new Fighter("Mahmut",10,95,85,55,50);

        Match match = new Match(f1,f2,85,105);
        match.run();


    }



}
