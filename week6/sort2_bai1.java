package week6;

import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sort2_bai1 {
    public static int binary_search(int x, List<Integer> arr, int l, int r) {
        int m;
        while (l <= r) {
            m = (l+r)/2;
            if ( arr.get(m) == x) {
                return m;
            }
            else if (arr.get(m) > x) {
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            l.add(x);
        }
        System.out.println(binary_search(v, l, 0, n-1));
    }
}
