package week3;

import java.util.Collections;
import java.util.List;

public class Pairs {
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

    public static int pairs(int k, List<Integer> arr) {
        Collections.sort(arr);
        int n = arr.size();

        int[] a = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            a[i] = arr.get(i);
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (binarySearch(a, i+1, n-1, a[i] + k) > 0) {
                cnt++;
            }
        }
        return cnt;
    }
}
