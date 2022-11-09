import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b, c;

        System.out.println("Enter a: ");
        a = sc.nextDouble();
        System.out.println("Enter b: ");
        b = sc.nextDouble();
        System.out.println("Enter c: ");
        c = sc.nextDouble();

        QuadraticEquation quaEqua = new QuadraticEquation(a, b, c);

        if (quaEqua.getDiscriminant() > 0) {
            System.out.println(quaEqua.getRoot1());
            System.out.println(quaEqua.getRoot2());
        } else if (quaEqua.getDiscriminant() == 0) {
            System.out.println(quaEqua.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}