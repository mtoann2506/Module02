import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Hoang", "Nhi", "Toan", "Chien", "Thien", "An", "Hai Anh"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name'student : ");
        String nameInput = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(nameInput)) {
                System.out.println("Position of the students " + nameInput + " in the list is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Student " + nameInput + " is not found in the array");
        }

    }
}
