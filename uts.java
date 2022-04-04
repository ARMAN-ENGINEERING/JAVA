
package burbblesort;
import java.util.*;
public class BurbbleSort {
    public static void main(String[] args) {
        ArrayList<Integer> nilai = new ArrayList();
        Scanner scan = new Scanner(System.in);
        System.out.print("Panjang Array : ");
        int panjangArray = scan.nextInt();
        for (int i = 0; i < panjangArray; i++) {
            System.out.print("Nilai "+i+" : ");
            int angka = scan.nextInt();
            nilai.add(angka);
        }
        for (int i = 0; i < nilai.size(); i++) {
            for (int j = 0; j < nilai.size()-1; j++) {
                if (nilai.get(j) > nilai.get(j+1)) {
                    int temp = nilai.get(j);
                    nilai.set(j, j+1);
                    nilai.set(j+1, temp);
                }
            }
        }
        System.out.println(nilai);
        Stack<Integer> n = new Stack();
        for (int i = 0; i < nilai.size(); i++) {
            n.add(nilai.get(i));
        }
        System.out.println("dipanggil : "+n.peek()); //pemanggilan stack
        n.pop(); //remove stack
        System.out.println("dipanggil : "+n.peek());
        
        //Queue
        Queue<Integer> antrian = new LinkedList();
        for (int i = 0; i < n.size(); i++) {
            antrian.add(n.get(i));
        }
        antrian.poll(); //remove
        System.out.println("Antrian : "+antrian.peek()); //pemanggilan queue
        
        //membalik character string
        String nama = "Arman";
        for (int i = nama.length()-1; i >= 0; i--) {
            System.out.println(nama.charAt(i));
        }
    }
    
}

