package week8;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean check = true;
        for (int i = 0; i <= s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                check = false;
                break;
            }
        }
        if (check) System.out.println("Yes");
        else System.out.println("No");
    }
}
