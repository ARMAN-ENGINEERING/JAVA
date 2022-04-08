import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int panjang, i, j;
        System.out.println("Panjang Array : ");
        panjang = input.nextInt();
        ArrayList<Integer> arr = new ArrayList();
        
        for (i = 0; i <= panjang - 1; i++) {
            System.out.println("Nilai index ke "+i+" : ");
            int nilai = input.nextInt();
            arr.add(nilai);
        }
        for (i = 0; i <= panjang - 2; i++) {
            int jMin;
            
            jMin = i;
            for (j = 1 + i; j <= panjang - 1; j++) {
                if (arr.get(j) < arr.get(jMin)) {
                    jMin = j;
                }
            }
            if (jMin != i) {
                int temp;
                
                temp = arr.get(i);
                arr.set(i, jMin);
                arr.set(jMin, temp);
            }
        }
        System.out.println(arr);
    }
}

