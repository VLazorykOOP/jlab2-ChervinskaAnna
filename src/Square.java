import java.util.Scanner;

public class Square {
    public double a;

    public Square() {
        this.a = 0.0;
    }

    public Square(double a) {
        this.a = a;
    }

    public void InputFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The side size of the square ");
        System.out.println("Enter a: ");
        this.a = scanner.nextDouble();
    }

    public void Perimeter() {
        double P = 4 * a;
        System.out.println("Perimeter = " + P);
    }

    public void SquareArea() {
        double S = a * a;
        System.out.println("Square area = " + S);
    }

    public void LengthOfDiagonals() {
        double D = a * Math.sqrt(2);
        System.out.println("Length of diagonals.= " + D);
    }
}
