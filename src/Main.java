import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Java Lab 2 ");
        System.out.println("Select the task you would like to see (1-3)");
        int choice = s.nextInt();
        if (s != null) {
            // s.close();
            switch (choice) {
                case 1: {
                    First();
                    break;
                }

                case 2: {
                    Second();
                    break;
                }

                case 3: {
                    Third();
                    break;
                }
                default: {
                    System.out.print("There is no number with this task number");
                    break;
                }
            }
        }
        s.close();
    }

    public static void First() {
        Point pointA = new Point();
        Point pointB = new Point();
        // Ввести координати з консолі.
        pointA.inputFromConsole();
        // Вивести інформацію про точку.
        System.out.println("Point A ");
        System.out.println("X " + pointA.x);
        System.out.println("Y " + pointA.y);

        pointB.inputFromConsole();
        System.out.println("Point B ");
        System.out.println("X " + pointB.x);
        System.out.println("Y " + pointB.y);

        pointA.MoveX(30);
        pointA.MoveY(5);
        pointB.MoveX(43);
        pointB.MoveY(8);
        pointA.distansePointZero();
        pointA.distansePointTwo(pointB);
        pointA.Polarni(pointB);
    }

    public static void Second() {
        Square square = new Square();

        square.InputFromConsole();
        System.out.println("The side size of the square ");
        System.out.println("a = " + square.a);
        square.Perimeter();
        square.SquareArea();
        square.LengthOfDiagonals();
    }

    public static void Third() {
        Raaandom randomObject = new Raaandom();
        randomObject.InputFromConsole();
        randomObject.MassiveAB();
        // randomObject.bubbleSort();
    }

}
