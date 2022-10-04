package week6;

import edu.princeton.cs.algs4.In;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CountingSort1 {
    public static List<Integer> countingSort(List<Integer> arr) {
        int n = arr.size();
        int max = arr.get(0);
        for (int i = 0; i < n; i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= max; i++) {
            res.add(0);
        }
        for (int i = 0; i <= max; i++) {
            int index = arr.get(i);
            res.set(index, res.get(index)+1);

        }
        return res;

        //int[] freq = new int[100];
        //HashMap<Integer, Integer>


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            l.add(x);
        }
        List<Integer> Result = CountingSort1.countingSort(l);
        for (int i = 0; i < Result.size(); i++) {
            System.out.print(Result.get(i) + " ");
        }
        System.out.println();
        System.out.println(Result.size());
    }

}
