package week3;

import java.util.List;

public class NewYearChaos {
    public static void minimumBribes(List<Integer> q) {
        int n = q.size();
        int min = 0;
        for (int i = 0; i < n; i++) {
            if (q.get(i) - 2 > i + 1) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = i - 1; j >= q.get(i) -2 && j >= 0; j--) {
                if (q.get(j) > q.get(i)) min++;
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {

    }
}
