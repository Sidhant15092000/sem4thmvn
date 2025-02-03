import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Calculating the sum
        int sum = num1 + num2;

        // Displaying the result
        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}

