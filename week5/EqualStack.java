package week5;

import java.util.List;

public class EqualStack {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int sum1 = 0, sum2 = 0, sum3 = 0;
        int n1 = h1.size();
        int n2 = h2.size();
        int n3 = h3.size();
        for (int i = 0; i < n1; i++) {
            sum1 += h1.get(i);
        }
        for (int i = 0; i < n2; i++) {
            sum2 += h2.get(i);
        }
        for (int i = 0; i < n3; i++) {
            sum3 += h3.get(i);
        }
        while (sum1 != sum2 || sum1 != sum3 || sum2 != sum3) {
            int min1 = Math.min(sum1, sum2);
            int min = Math.min(min1, sum3);
            if (sum1 != min) {
                sum1 -= h1.get(0);
                h1.remove(0);
            }
            if (sum2 != min) {
                sum2 -= h2.get(0);
                h2.remove(0);
            }
            if (sum3 != min) {
                sum3 -= h3.get(0);
                h3.remove(0);
            }

        }
        return sum1;
    }

    public static void main(String[] args) {

    }
}

