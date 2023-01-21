public class task3 {
    public static boolean PrChislo(int a){
        for (int i = 2; i < a; i++) {
            if (a%i==0) return false; 
        }
        return true;
    }
    

    public static void main(String[] args) {
    for (int i = 2; i < 100; i++) {
        if (PrChislo(i)==true) System.out.printf("%d ", i);
    }
}  
}
