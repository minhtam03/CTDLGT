package week2;

import edu.princeton.cs.algs4.In;

import java.util.Arrays;

// tư tưởng: sắp xếp, tìm kiếm nhị phân, xét a[i], xem từ i + 1 đến hết mảng có phần tử - a[i] không
public class sumtwo {
    public static int binarySearch(int a[], int l, int r, int x) {
        int m;
        while (l <= r) {
            m = (l+r)/2;
            if ( a[m] == x) {
                return m;
            }
            else if (a[m] > x) {
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        In in = new In("D:\\code\\JavaLibrary\\algs4-data\\algs4-data\\4Kints.txt");
        int [] a = in.readAllInts();
        int num = a.length;

        Arrays.sort(a);

        for (int i = 0; i < num; i++) {
            if (binarySearch(a, i+1, num-1, -a[i]) > 0) {
                System.out.println(a[i] + " " + -a[i]);
            }
        }
// dùng 2 con trỏ chạy
        for (int i = 0; i < num; i++) {
            int j = num - 1;
            while (i < j) {
                int s = a[i] + a[j];
                if (s == 0) {
                    System.out.println(a[i] + " " + a[j]);
                    i++;
                }
                else if (s > 0) {
                    j--;
                }
                else {
                    i++;
                }
            }
        }
    }

}
