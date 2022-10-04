package week2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.UF;
public class UF_ex2 {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        boolean check = false;
        int index = 0;
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!uf.connected(p, q)) {
                uf.union(p, q);
                //System.out.println("da lien thong: " + p + " " + q);
            }
            index++;

            if (uf.count() == 1) {
                check = true;
                System.out.println(index);
                break;
            }
        }
        if (!check) {
            System.out.println("FAIED");
        }
    }
}
