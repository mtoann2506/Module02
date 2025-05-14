import java.util.Scanner;

public class DrawGeometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("1.Draw the rectangle");
            System.out.println("2.Draw the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3.Draw the isosceles triangle");
            System.out.println("0.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("Drawing a rectangle:");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j <= 6; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Drawing a square triangle:");
                    System.out.println("The corner is square at bottom-left:");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("The corner is square at top-left:");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("The corner is square at bottom-right:");
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print("  ");
                        }
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    System.out.println("The corner is square at top-right:");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("  ");
                        }
                        for (int k = i; k <= 5 ; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Drawing an isosceles triangle:");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}