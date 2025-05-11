import java.util.Scanner;
public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter b number: ");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0|| b==0){
            System.out.println("No Greatest Common Factor");
        }else{
            while(a!=b){
                if (a>b){
                    a = a-b;
                }else{
                    b = b-a;
                }
            }
            System.out.println("The Greatest Common Factor is: " + a);
        }
    }
}
