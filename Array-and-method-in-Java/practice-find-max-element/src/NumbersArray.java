import java.util.Scanner;

public class NumbersArray {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size : ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Proper list : ");
        for (int j = 0; j < size; j++) {
            System.out.print( arr[j] + "\t");
        }
        int max = arr[0];
        int index = 1;
        for (int j = 1; j < size; j++) {
            if (arr[j] > max) {
                max = arr[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " , at position : " + index);

    }
}
