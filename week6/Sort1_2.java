package week6;

import java.util.List;

public class Sort1_2 {
    public static void insertionSort2(int n, List<Integer> arr) {
        for (int i = 1; i < n; i++) {
            int x = arr.get(i);
            for (int j = n-2; j >= 0; j--) {
                if (arr.get(j) > x) {
                    arr.set(j+1, arr.get(j));
                }
                else {
                    arr.set(j+1, x);
                    break;
                }
                for (int k = 0; k < n; k++) {

                }
            }
            if (x < arr.get(0)) {
                arr.set(0, x);
            }
            for (int k = 0; k < n; k++) {
                System.out.print(arr.get(k) + " ");
            }
            System.out.println();
        }
    }
}
