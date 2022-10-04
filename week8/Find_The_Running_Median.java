package week8;

import java.util.*;

/**
 * thêm 1 phần tử đầu tiên vào max
 * duyệt từ phần tử 1-> hết
 * mỗi lần lặp: thêm phần tử: nếu max nhiều phần tử hơn min thì thêm vào min, ngược lại thì thêm vào max
 *              kiểm tra đúng tính chất: xem đúng là peek của max nhỏ hơn peek của min chưa, nếu chưa thì swap
 *              số trung vị: + là peek của max nếu max nhiều hơn 1 phần tử
 *                           + là trung bình cộng của peek max và peek min nếu 2 bên có số phần tử bằng nhau
 */
public class Find_The_Running_Median {
    public static List<Double> runningMedian(List<Integer> a) {
        List<Double> result = new ArrayList<>();
        Queue<Integer> minHeap = new PriorityQueue<>();
        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        maxHeap.add(a.get(0));

        result.add(a.get(0).doubleValue());

        for (int i = 1; i < a.size(); i++) {
            if (maxHeap.size() > minHeap.size()) {
                minHeap.add(a.get(i));
            }
            else {
                maxHeap.add(a.get(i));
            }
            if (maxHeap.peek() > minHeap.peek()) {
                int smaller = minHeap.poll();
                int bigger = maxHeap.poll();
                minHeap.add(bigger);
                maxHeap.add(smaller);
            }
            if (minHeap.size() == maxHeap.size()) {
                double m = (minHeap.peek() * 1.0 + maxHeap.peek()) / 2 ;
                result.add((double) m);
            }
            else {
                result.add(Double.valueOf(maxHeap.peek()));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        List<Double> res = new ArrayList<>();
        res = Find_The_Running_Median.runningMedian(a);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
    }
}
