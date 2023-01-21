import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
public class task1 {
    static public int[] GenMas(int[] arr){
        Random rnd = new Random();
        int max_d = 300 , min_d = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]= rnd.nextInt((max_d-min_d)+1)+min_d;
            // System.out.println(arr[i]);
            
        }
        
        return arr;
    }
    static public void MinMax(int[] arr){
        int minn = arr[0];
        int maxx = arr[0];
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
                if (arr[i]>maxx) maxx = arr[i];
                if (arr[i]<minn) minn = arr[i];
                temp +=arr[i];
        }
        System.out.println("Максимум: " + maxx);
        System.out.println("Минимум: " + minn);
        System.out.println("Среднее значение " + temp/arr.length);
    }

    public static void main(String[] args) {
        int[] ar = new int[10];
        ar = GenMas(ar);
        System.out.println("Массив: " + Arrays.toString(ar) );
        MinMax(ar);

    }
}
