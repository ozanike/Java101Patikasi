package Arrays;

public class harmonicArray {
    public static void main(String[] args) {

        int[] list = {1,2,3,4,5,6,7,8,9,10};
        double sum = 0;

        for (int i = 0; i < list.length; i++){
            sum += 1.0 / list[i];

        }
        System.out.println(sum);




    }
}
