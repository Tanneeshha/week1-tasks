import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.print("\nEnter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Select any one function (+, -, *, /): ");
        char func = scanner.next().charAt(0);
        double result = 0;

        boolean validFunction = true;
        if (func == '+'){
            result = num1 + num2;
        }

        else if (func == '-'){
            result = num1 - num2;
        }

        else if (func == '*'){
            result = num1 * num2;
        }

        else if (func == '/'){
            if (num2 != 0){
                result = num1/num2;
            }
            else {
                System.out.println("Error");
                validFunction = false;
            }
        }
        if (validFunction){
            System.out.println("Result = "+ result);
        }
        scanner.close();
    }    
}
