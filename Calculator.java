import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select operation");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose your option (1-4): ");
        int choise = scanner.nextInt();

        double result = 0;

        switch (choise) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: You can't divide by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Wrong choice!");
                return;
        }
        System.out.println("The result is: " + result);

    }

}
