package week2;

import edu.princeton.cs.algs4.StdDraw;

//import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setXscale(-1, +1);
        StdDraw.setYscale(-1, +1);
        StdDraw.setPenColor(StdDraw.PINK);

        double x0 = 0, y0 = 0;
        for (double t = 0.0; t <= 360.0; t += 0.1) {
            double theta = Math.toRadians(t);
            double r = Math.sin(n * theta);
            double x1 = r * Math.cos(theta);
            double y1 = r * Math.sin(theta);
            StdDraw.line(x0, y0, x1, y1);
            x0 = x1;
            y0 = y1;
        }
    }
}
//    public static void main(String[] args) {
//        // nhap mang va in mang
//        Scanner sc = new Scanner(System.in);
//        int []a = new int[10];
//        for (int i = 0; i < 10; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print(a[i] + " ");
//        }
//
//        // nhap so n va mang a co n so nguyen
//        Scanner sc1 = new Scanner(System.in);
//        int n = sc1.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc1.nextInt();
//        }
//
//        int maxValue = arr[0];
//        for (int i = 1; i < n; i++) {
//            if (arr[i] > maxValue) {
//                maxValue = arr[i];
//            }
//        }
//
//        System.out.print(maxValue);
//    }