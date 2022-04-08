import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int panjang, i, j;
        
        panjang = input.nextInt();
        int[] arr = new int[panjang];
        
        for (i = 0; i <= panjang - 1; i++) {
            arr[i] = input.nextInt();
        }
        for (i = 0; i <= panjang - 2; i++) {
            int jMin;
            
            jMin = i;
            for (j = 1 + i; j <= panjang - 1; j++) {
                if (arr[j] < arr[jMin]) {
                    jMin = j;
                }
            }
            if (jMin != i) {
                int temp;
                
                temp = arr[i];
                arr[i] = arr[jMin];
                arr[jMin] = temp;
            }
        }
        for (i = 0; i <= panjang - 1; i++) {
            System.out.println(arr[i]);
        }
    }
}
