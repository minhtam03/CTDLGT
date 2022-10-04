package week6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sort1_1 {

    /** tại mỗi lần lặp, coi phần tử đang xét là phần tử nhỏ nhât
     * cập nhật lại vị trí của phần tử nhỏ nhất bằng cách duyệt từ i+1 đến cuối dãy
     * sau đó đổi vị trí của phần tử đang xét và phần tử nhỏ nhất
     */
    public static void selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min])
                    min = j;

            // Hoán đổi phần tử nhỏ nhất và phần tử đang xét
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }


    /** xét phần tử thứ i, coi dãy từ đầu đến i - 1 đã được sắp xếp rồi
     * chèn phần tử arr[i] đó vào đúng vị trí bằng cách duyệt chỉ số j ngược lại từ i đến 1
     * nếu arr[j] < arr[j-1] thì đổi chỗ
     * khi gặp 1 phần tử mà arr[j] đã lớn hơn nó hoặc khi chạm đến đầu mảng thì dãy bên trái tính đến i đã được sắp xếp
    */
    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else break;
            }
        }
    }


    /** Chèn 1 phần tử cho trước ở cuối mảng vào đúng vị trí của nó, các phần tử phía trước đã được sắp xếp */
    public static void insertionSort1(int n, List<Integer> arr) {
        int x = arr.get(n-1);
        for (int i = n-2; i >= 0; i--) {
            if (arr.get(i) > x) {
                arr.set(i+1, arr.get(i));   // nếu x vẫn còn nhỏ hơn thì đẩy a[i] sang bên phải
            }
            else {
                arr.set(i+1, x);
                for (int k = 0; k < n; k++) {
                    System.out.print(arr.get(k) + " ");
                }
                System.out.println();
                break;
            }
            for (int k = 0; k < n; k++) {
                System.out.print(arr.get(k) + " ");
            }
            System.out.println();
        }
        if (x < arr.get(0)) {
            arr.set(0, x);
            for (int k = 0; k < n; k++) {
                System.out.print(arr.get(k) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List <Integer> l = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }
        insertionSort1(n, l);
    }

}
