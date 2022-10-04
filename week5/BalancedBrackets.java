package week5;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static String isBalanced(String s) {
        Stack<Character> st = new Stack<Character>();
        if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}')
            return "NO";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            }
            else if (c == ')' || c == ']' || c == '}') {
                if (st.empty())
                    return "NO";
                if ((c == ')' && st.peek() == '(') || (c == ']' && st.peek() == '[') || (c == '}' && st.peek() == '{')) {
                    st.pop();
                }
                else {
                    return "NO";
                }
            }
        }
        if (st.empty()) return "YES";
        else return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isBalanced(s));
    }

}
