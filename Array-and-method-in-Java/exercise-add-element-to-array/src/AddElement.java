import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // B1: Nhập số lượng phần tử
        System.out.print("Enter the number of elements in the array (N): ");
        int n = sc.nextInt();

        // Khai báo và nhập mảng ban đầu
        int[] Arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            Arr[i] = sc.nextInt();
        }

        // B2: Nhập phần tử cần thêm
        System.out.print("Enter the element to be added (x): ");
        int x = sc.nextInt();

        // B3: Nhập vị trí cần thêm và kiểm tra hợp lệ
        System.out.println("Enter the index to add the element (index) : ");
        int index = sc.nextInt();
        if (index <= -1 || index > n) {
            System.out.println("Invalid index. Please enter a valid index.");
        } else {

            // B4: Tạo mảng mới có kích thước n+1 ( vì thêm phần tử nên kích thước tăng lên 1 )
            int[] arr = new int[n + 1];
            System.arraycopy(Arr, 0, arr, 0, index);

            // B5: Thêm phần tử x vào vị trí index
            arr[index] = x;
            System.arraycopy(Arr, index, arr, index + 1, n - index);

            // B6 : In ra mảng sau khi thêm phần tử
            System.out.print("Array after adding element " + x + " at index " + index + ":");
            for (int i : arr) {
                System.out.print(i + " ");
            }


        }

    }
}
