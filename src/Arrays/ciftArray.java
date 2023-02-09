package Arrays;
import java.util.Arrays;

public class ciftArray {

    static boolean isHas(int[] arr,int value){

        for (int i: arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {1,1,1,2,2,2,3,3,4,4,6,6,8,7,7};
        int[] dublicate = new int[list.length];
        int startindex = 0;

        for(int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                if((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0 && list[j] % 2 == 0)){
                    if(!isHas(dublicate,list[i]))
                    dublicate[startindex++] = list[i];
                    break;

                }

            }
        }
        for(int value: dublicate){
            if (value != 0){
                System.out.println(value);

            }
        }
    }
}
