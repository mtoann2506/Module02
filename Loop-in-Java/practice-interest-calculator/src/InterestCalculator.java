import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter invesment amount: ");
        double money = sc.nextDouble();
        System.out.println("Enter number of months : ");
        int month = sc.nextInt();
        System.out.println("Enter interest rate: ");
        double interestRate = sc.nextDouble();
        double totalInterest = 0;
        int i = 0;
        for (; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Total money after " + i + " month(s) is: " + totalInterest);
    }
}
