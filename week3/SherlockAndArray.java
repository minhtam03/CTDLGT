package week3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SherlockAndArray {

    public static String balancedSums(List<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        int sum_left = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (sum == 2 * sum_left + arr.get(i)) return "YES";
            sum_left += arr.get(i);
        }
        return "NO";
    }

    public static void main(String[] args) {

    }
}
