import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;;

public class HomeWork {
    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        // List<Integer> int_list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        List<Integer> int_list = GenList(kolvo());
        System.out.println("Исходный массив: " + int_list);
        System.out.println("Максимум: " + getMax(int_list));
        System.out.println("Минимум: " + getMin(int_list));
        System.out.println("Среднее значение: " + getAverage(int_list));
        System.out.println(removeEvenValue(int_list));

    }
    private static Integer kolvo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элеметов: ");
        Integer n = sc.nextInt();
        sc.close();        
        return n;
    }
    public static List<Integer> GenList(Integer n){
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        int max_d = 100 , min_d = 0;
            for (int i = 0; i < n+1; i++) {
                list.add(i,rnd.nextInt((max_d-min_d)+1)+min_d);
             } return list;
    }

    // Нужно удалить из него четные числа
    public static List<Integer> removeEvenValue(List<Integer> lst){
         for (int i = lst.size()-1 ; i >=0; i--) {
         if (lst.get(i)%2 == 0){
            // System.out.printf("%d, ",lst.get(i));
           lst.remove(i);
         }   
        }
       
        return lst;
        
    }

    // Найти минимальное значение
    public static Integer getMin(List<Integer> list){
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++){
            if (list.get(i) < min) min = list.get(i);
        }
        return min;
    }

    // Найти максимальное значение
    public static Integer getMax(List<Integer> list){
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++){
            if (list.get(i) > max) max = list.get(i);
        }
        return max;
    }

    // Найти среднее значение
    public static Integer getAverage(List<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        return sum/list.size();
    }

}
