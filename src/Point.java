import java.util.Scanner;
import java.lang.Math;

public class Point {
    public double x;
    public double y;

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void inputFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point");
        System.out.println("Enter X: ");
        this.x = scanner.nextDouble();

        System.out.println("Enter Y: ");
        this.y = scanner.nextDouble();
    }

    public void distansePointZero() {
        double D0 = Math.sqrt((x - 0) * (x - 0) + (y - 0) * (y - 0));
        System.out.println("Distanse " + D0);
    }

    public double distansePointTwo(Point p2) {

        double AB = Math.sqrt((x - p2.x) * (x - p2.x) + (y - p2.y) * (y - p2.y));
        System.out.println("Distanse between AB " + AB);
        return AB;
    }

    public void Polarni(Point p2) {
        double r1 = Math.sqrt(x * x + y * y);
        double r2 = Math.sqrt(p2.x * p2.x + p2.y * p2.y);
        System.out.println("Conversion to polar coordinates A " + r1);
        System.out.println("Conversion to polar coordinates B " + r2);
    }

    public void MoveX(double value) {
        x += value;
        System.out.println("Move X" + x);
    }

    public void MoveY(double value) {
        y += value;
        System.out.println("Move Y" + y);
    }
}
