import java.util.Scanner;

public class PatternsPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose any one pattern: ");
        System.out.println("1. Pyramid");
        System.out.println("2. Diamond");
        int choose = scanner.nextInt();

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        if (choose == 1) {
            printPyramid(rows);
        } else if (choose == 2) {
            printDiamond(rows);
        } else {
            System.out.println("Invalid Choice.");
        }

        scanner.close();
    }

    public static void printDiamond(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) { 
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) { 
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) { 
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
