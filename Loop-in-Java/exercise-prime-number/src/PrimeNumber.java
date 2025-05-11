import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in ra: ");
        int count = sc.nextInt();
        int number = 2; // Số nguyên tố đầu tiên
        int printedPrimeNumber = 0; // Số lượng số nguyên tố đã in ra
        System.out.println("Các số nguyên tố là: ");
        while (printedPrimeNumber < count) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
                if (isPrime) {
                System.out.print(number + " ");
                printedPrimeNumber++;
            }
            number++;
        }
    }
}
