import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        double a = sc.nextDouble();
        System.out.println("Enter b : ");
        double b = sc.nextDouble();
        System.out.println("Enter c : ");
        double c = sc.nextDouble();
        QuadraticEquation q = new QuadraticEquation(a, b, c);
        double delta = q.getDiscriminant();
        if (delta > 0) {
            System.out.println("The equation has two roots: " + q.getRoot1() + " and " + q.getRoot2());
        } else if (delta == 0) {
            System.out.println("The equation has one root: " + q.getRoot1());
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}