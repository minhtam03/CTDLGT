package week8;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class JesseAndCookies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, k;
        N = scanner.nextInt();
        k = scanner.nextInt();

        Queue pqueue = new PriorityQueue(N);
        for (int i = 0; i < N; i++) {
            pqueue.add(scanner.nextInt());
        }

        int cnt = 0;
        while(pqueue.size() > 1 && (int)pqueue.peek() < k) {
            int m1 = (int) pqueue.remove();

            int m2 = (int) pqueue.remove();

            int sub = m1 + 2 * m2;
            pqueue.add(sub);
            cnt++;

            Iterator value = pqueue.iterator();
            boolean check = true;
            while (value.hasNext()) {
                if ((int)value.next() < k) {
                    check = false;
                    break;
                }
            }
            if (check) break;
        }
        if (pqueue.size() == 1 && (int)pqueue.peek() < k) cnt = -1;
        System.out.println(cnt);
    }
}


//    public static void main(String[] args) {
//        Layer l = new Layer();
//
//        Point p1 = new Point(10, 5);
//        Circle c1 = new Circle(p1, 8, "red", true);
//
//        Point p2 = new Point(10, 5);
//        Rectangle r1 = new Rectangle(p2, 8, 6, "red", true);
//
//        Circle c2 = new Circle(p1, 4, "red", true);
//
//        Rectangle r2 = new Rectangle(p2, 8, 6, "blue", true);
//
//        Point p3 = new Point(10, 5);
//        Square s1 = new Square(p3, 8, "red", true);
//
//        Rectangle r3 = new Rectangle(p2, 8, 6, "red", true);
//        l.shapes.add(c1);
//        l.shapes.add(r1);
//        l.shapes.add(c2);
//        l.shapes.add(s1);
//        l.shapes.add(r2);
//        l.shapes.add(r3);
//
//        System.out.println(l.getInfo());
//        System.out.println("------");
//        for (int i = 0; i < l.shapes.size(); i++) {
//            System.out.println(l.shapes.get(i).hashCode());
//        }
//        l.removeDuplicates();
//
//        System.out.println(l.getInfo());
//
//    }
