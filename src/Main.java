import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Java Lab 2 ");
        System.out.println("Select the task you would like to see (1-4)");
        int choice = s.nextInt();
        if (s != null) {
            s.close();

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

                case 4: {
                    Fourth();
                    break;
                }
                default: {
                    System.out.print("There is no number with this task number");
                    break;
                }
            }
        }
    }

    public static void First() {

    }

    public static void Second() {

    }

    public static void Third() {

    }

    public static void Fourth() {

    }

}
