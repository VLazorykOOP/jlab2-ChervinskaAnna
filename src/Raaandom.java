import java.util.Random;
import java.util.Scanner;

public class Raaandom {
    int lenght1;
    int lenght2;

    public Raaandom() {
        this.lenght1 = 0;
        this.lenght2 = 0;
    }

    public Raaandom(int lenght1, int lenght2) {
        this.lenght1 = lenght1;
        this.lenght2 = lenght2;
    }

    public void InputFromConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size massive A");
        lenght1 = scanner.nextInt();

        System.out.println("Enter size massive B");
        lenght2 = scanner.nextInt();
    }

    public void MassiveAB() {
        Random random = new Random();
        double[] A = new double[lenght1];
        double[] B = new double[lenght2];

        for (int i = 0; i < lenght1; i++) {
            A[i] = random.nextInt(10000);
        }
        System.out.println("Massive A:");
        for (double value : A) {
            System.out.println(value + " ");
        }
        for (int i = 0; i < lenght2; i++) {
            B[i] = random.nextInt(10000);
        }
        System.out.println("Massive B:");
        for (double value : B) {
            System.out.println(value + " ");
        }

    }

    static void bubbleSort(int[] A) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Порівнюємо сусідні елементи
                if (A[j] > A[j + 1]) {
                    // Обмін значень, якщо вони в неправильному порядку
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        for (double value : A) {
            System.out.println(value + " ");
        }
    }
}