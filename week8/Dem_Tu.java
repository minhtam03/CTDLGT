package week8;

public class Dem_Tu {
    public static void main(String[] args) {
        String s = "abc, def, abcdde, def, abc, abc, ed";
        String [] a = s.split("[, ]+", 0);
        for (String t : a) {
            System.out.println(t);
        }
        boolean check[] = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            if (check[i]) continue;
            int c = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i].equals(a[j])) {
                    c++;
                    check[j] = true;
                }
            }
            System.out.println(a[i] + " " + c);
        }

    }

}
