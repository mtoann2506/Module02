
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Fan fan1 = new Fan();
    fan1.setSpeed(3);
    fan1.setRadius(10.0);
    fan1.setColor("yellow");
    fan1.setOn(true);
    Fan fan2 = new Fan();
    fan2.setSpeed(1);
    fan2.setRadius(5.0);
    fan2.setColor("blue");
    fan2.setOn(false);
    Fan fan3 = new Fan();
    fan3.setOn(true);
        System.out.println(fan1);
        System.out.println(fan2);
        System.out.println(fan3);
    }
}