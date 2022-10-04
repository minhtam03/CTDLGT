//package week5;
//
//import java.util.Iterator;
//import java.util.Scanner;
//import java.util.Stack;
//
//public class SimpleTextEditor {
///**    public static class TextEditor {
//        int type_q;
//        static StringBuilder S = new StringBuilder();
//        //public static Stack<StringBuilder> st = new Stack<StringBuilder>();
//
//        public void append(String w) {
//            S.append(w);
//            st.push(S);
//            System.out.print("stack ham append: ");
//            if (!st.empty()) {
//                Iterator<StringBuilder> iterator = st.iterator();
//                while (iterator.hasNext()) {
//                    StringBuilder val = iterator.next();
//                    System.out.print(val + ", ");
//                }
//            }
//        }
//        public void delete(int k) {
//            S.delete(S.length() - k, S.length());
//            st.push(S);
//            System.out.print("stack ham delete: ");
//            if (!st.empty()) {
//                Iterator<StringBuilder> iterator = st.iterator();
//                while (iterator.hasNext()) {
//                    StringBuilder val = iterator.next();
//                    System.out.print(val + ", ");
//                }
//            }
//        }
//        public void print(int k) {
//            System.out.println(S.charAt(k-1));
//            System.out.print("stack ham print: ");
//            if (!st.empty()) {
//                Iterator<StringBuilder> iterator = st.iterator();
//                while (iterator.hasNext()) {
//                    StringBuilder val = iterator.next();
//                    System.out.print(val + ", ");
//                }
//            }
//        }
//        public void undo() {
//            if (!st.empty()) {
//                Iterator<StringBuilder> iterator = st.iterator();
//                while (iterator.hasNext()) {
//                    StringBuilder val = iterator.next();
//                    System.out.print(val + ", ");
//                }
//                st.pop();
//                S = st.peek();
//
//                System.out.println(S);
//            }
//            else S.setLength(0);
//        }
//    }
//*/
//    public static void main(String[] args) {
//        //TextEditor t = new TextEditor();
//        Scanner sc = new Scanner(System.in);
//        String s = new String();
//        Stack<String> st = new Stack<String>();
//
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            int type = sc.nextInt();
//            if (type == 1) {
//                String w = sc.next()
//                String temp = s + w;
//                s += w;
//                st.push(temp);
//                System.out.print("stack ham append: ");
//                if (!st.empty()) {
//                    Iterator<String> iterator = st.iterator();
//                    while (iterator.hasNext()) {
//                        String val = iterator.next();
//                        System.out.print(val + ", ");
//                    }
//                }
//            } else if (type == 2) {
//                int k = sc.nextInt();
//
//                StringBuilder temp = S;
//                st.push(temp);
//                System.out.print("stack ham delete: ");
//                if (!st.empty()) {
//                    Iterator<StringBuilder> iterator = st.iterator();
//                    while (iterator.hasNext()) {
//                        StringBuilder val = iterator.next();
//                        System.out.print(val + ", ");
//                    }
//                }
//            } else if (type == 3) {
//                int k = sc.nextInt();
//                System.out.println(S.charAt(k-1));
//                System.out.print("stack ham print: ");
//                if (!st.empty()) {
//                    Iterator<StringBuilder> iterator = st.iterator();
//                    while (iterator.hasNext()) {
//                        StringBuilder val = iterator.next();
//                        System.out.print(val + ", ");
//                    }
//                }
//            } else if (type == 4) {
//                if (!st.empty()) {
//                    Iterator<StringBuilder> iterator = st.iterator();
//                    while (iterator.hasNext()) {
//                        StringBuilder val = iterator.next();
//                        System.out.print(val + ", ");
//                    }
//                    st.pop();
//                    S = st.peek();
//
//                    System.out.println(S);
//                }
//                else S.setLength(0);
//            }
//        }
//    }
//}
