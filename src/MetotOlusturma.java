public class MetotOlusturma {

    static int f(int n){
        System.out.print(n + " ");
        if(n <= 0){
            return n+5;
        }
        int i = f(n-5) +5;
        System.out.print(i + " ");
        return i;
    }
    public static void main(String[] args) {

        f(16);

    }
}
