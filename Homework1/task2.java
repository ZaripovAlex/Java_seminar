import java.util.Random;
import java.lang.reflect.Array;
import java.util.Arrays;
public class task2 {
    static public int[] GenMas(int[] arr){
        Random rnd = new Random();
        int max_d = 300 , min_d = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]= rnd.nextInt((max_d-min_d)+1)+min_d;
        }
        System.out.println("Начальный массив: " + Arrays.toString(arr));
        return arr;
    }
    static public int[] Bubble(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }   
        }
        System.out.println("Итоговый массив: " + Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
      int[] ar = new int[10];
      ar = GenMas(ar);
      ar = Bubble(ar);

    }
}
