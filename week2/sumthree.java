package week2;//public class sumthree {
//    i  j;
//    while (i < j) {
//            s = i + j;
//    = 0 thì ok
//        > 0 thì giảm j;
//    < 0 thì tang i;
//
//    }
//}
//}
import edu.princeton.cs.algs4.In;

import java.util.Arrays;
import java.util.Date;

public class sumthree {
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
        long s_time;


        System.out.print("Cac bo 3 so co tong bang 0 theo cach 3 vong lap la: ");
        int count_c1 = 0;
        s_time = (new Date()).getTime();
        for (int i = 0; i < num-2; i++) {
            for (int j = i+1; j < num-1; j++) {
                for (int k = j+1; k < num; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        //System.out.println(a[i] + " " + a[j] + " " + a[k]);
                        count_c1++;
                    }
                }
            }
        }
        System.out.println(count_c1);
        System.out.print("Time method 1 la: ");
        System.out.println((new Date()).getTime() - s_time);
        System.out.println("-------Het cach 1-------");

        System.out.print("Cac bo 3 so co tong bang 0 theo cach 3 chi so chay la: ");
        int count_c2 = 0;
        s_time = (new Date()).getTime();

        for (int i = 0; i < a.length; i++) {
            int j = i + 1;
            int k = num - 1;
            while (j < k) {
                int s = a[i] + a[j] + a[k];
                if (s == 0) {
                    //System.out.println(a[i] + " " + a[j] + " " + a[k]);
                    j++;
                    count_c2++;

                }
                else if (s < 0) j++;
                else k--;
            }
        }
        System.out.println(count_c2);
        System.out.print("Time method 2 la: ");
        System.out.println((new Date()).getTime() - s_time);
        System.out.println("------Het cach 2-------");

        System.out.println("Cac bo 3 so co tong bang 0 theo cach tim kiem nhi phan la: ");
        int count_c3 = 0;
        s_time = (new Date()).getTime();

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (binarySearch(a, j+1, num-1, -a[i]-a[j]) > 0) {
                    count_c3++;
                }
            }
        }
        System.out.println(count_c3);
        System.out.print("Time method 3 la: ");
        System.out.println((new Date()).getTime() - s_time);
        System.out.println("------Het cach 3-------");
    }

}
