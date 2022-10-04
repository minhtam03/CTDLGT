package week2;

import edu.princeton.cs.algs4.In;
public class bai4 {
    public static void main(String[] args) {
        In in = new In("D:\\code\\JavaLibrary\\algs4-data\\algs4-data\\4Kints.txt");
        int [] a = in.readAllInts();
        int num = a.length;
        System.out.println("so phan tu cua mang: " + num);
        for (int i = 0; i < num-2; i++) {
            for (int j = i+1; j < num-1; j++) {
                for (int k = j+1; k < num; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                    }
                }
            }
        }
        //StdArrayIO.print();
    }

}
