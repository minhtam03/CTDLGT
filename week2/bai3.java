package week2;

import edu.princeton.cs.algs4.In;
public class bai3 {
    public static void main(String[] args) {
        In in = new In("D:\\code\\JavaLibrary\\algs4-data\\algs4-data\\4Kints.txt");
        int [] a = in.readAllInts();
        int num = a.length;
        System.out.println("so phan tu cua mang: " + num);
        for (int i = 0; i < num-1; i++) {
            for (int j = i+1; j < num; j++) {
                if (a[i] + a[j] == 0) {
                    System.out.println(a[i] + " " + a[j]);
                }
            }
        }
        //StdArrayIO.print();
    }

}
