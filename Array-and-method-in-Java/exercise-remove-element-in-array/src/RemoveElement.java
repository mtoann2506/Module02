import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //B1 : Nhap so luong phan tu cua mang (N)
        System.out.println("Enter the length of the array(N) : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        //B2 : Nhap phan tu can xoa (x)
        System.out.println("Enter the removed element (x) : ");
        int x = sc.nextInt();
        //B3 : Tim phan tu can xoa (x) trong mang (arr)
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }
        //Luu y : Kiem tra neu chi so của x co ton tai trong mang hay khong, neu co thi xoa phan tu
        if (index == -1) {
            System.out.println("The element " + x + " is not in the array.");
        } else {
            for (int i = index; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
            //B4 : In ra mang sau khi xoa phan tu (x)
            System.out.println("The array after removing the element " + x + " : ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}