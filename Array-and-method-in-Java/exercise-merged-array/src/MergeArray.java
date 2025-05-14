import java.util.Scanner;
import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        //B1 : Tạo ra 2 mảng số nguyên và kích thước của chúng
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array:");
        int n = sc.nextInt();
        System.out.println("Enter the size of the second array:");
        int m = sc.nextInt();
        //B2 : Nhập số lượng phần tử cho 2 mảng
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        System.out.print("Enter the elements of the first array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        //B3 : Tạo ra mảng mới có kích thước bằng tổng 2 mảng
        int[] arr3 = new int[n + m];
        //B4 : Gộp 2 mảng vào mảng mới
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, n, arr2.length);
        //B5 : In ra
        System.out.println("Array after merging:");
            System.out.println(Arrays.toString(arr3));
        }
    }
