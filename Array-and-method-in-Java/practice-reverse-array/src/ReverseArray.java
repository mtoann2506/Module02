import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        //NHAP KICH THUOC CUA MANG
        do {
            System.out.print("Enter the size of the array: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("The array is too large.");
            }
        } while (size > 20);
        //NHAP VAO CAC PHAN TU TRONG MANG
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        // IN RA CAC PHAN TU TRONG MANG
        System.out.printf("%-20s%s", "Elements in array : ", "");
        for (int k : arr) {
            System.out.print(k + "\t");
        }
        //DAO NGUOC MANG
        for (int j = 0; j < arr.length / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[size - j - 1];
            arr[size - j - 1] = temp;
        }
        //IN RA CAC PHAN TU SAU KHI DAO NGUOC
        System.out.printf("\n%-20s%s", "Reverse Array:", "");
        for (int k : arr) {
            System.out.print(k + "\t");
        }

    }
}
