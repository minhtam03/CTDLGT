package week5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// cai dat va su dung Queue trong thư vien co san cua Java
public class QueueUsingTwoStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int x;
            x = sc.nextInt();
            if (x == 1) {
                int e;
                e = sc.nextInt();
                q.add(e);

            } else if (x == 2) {
                q.remove();
            } else if (x == 3) {
                System.out.println(q.peek());
            }
        }
    }
}
