import java.util.Random;
import java.util.Scanner;

public class Raaandom {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public Raaandom() {
    }

    public double[] GetMassiv() {
        System.out.println("Enter size:");
        int lenght = scanner.nextInt();
        double[] res = new double[lenght];

        for (int i = 0; i < lenght; i++) {
            res[i] = random.nextInt(10000);
        }

        return res;
    }

    public void PrintMassiv(double[] a) {

        for (double value : a) {
            System.out.println(value + " ");
        }

    }

    public static void bubbleSort(double[] A) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Порівнюємо сусідні елементи
                if (A[j] > A[j + 1]) {
                    // Обмін значень, якщо вони в неправильному порядку
                    double temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }

    public double[] Combine(double[] A, double[] B) {
        double[] Res = new double[A.length + B.length];
        for (int i = 0, j = 0; i < A.length || j < B.length;) {
            if (j == B.length || i < A.length && A[i] < B[j]) {
                Res[i + j] = A[i];

                i++;
            } else {
                Res[i + j] = B[j];

                j++;
            }
        }
        return Res;
    }
}