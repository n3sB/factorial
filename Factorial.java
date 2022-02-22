package factorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1, number2, number3, combination, sum1 = 1, sum2 = 1, sum3 = 1;

        System.out.print("Please enter the number of elements of the set: ");
        number1 = scanner.nextInt();

        System.out.print("Please enter the group number: ");
        number2 = scanner.nextInt();
        number3 = number1 - number2;

        for (int i = 1; i <= number1; i++) {
            sum1 *= i;
        }
        for (int i = 1; i <= number2; i++) {
            sum2 *= i;
        }
        for (int i = 1; i <= number3; i++) {
            sum3 *= i;
        }

        combination = sum1 / (sum2 * sum3);

        System.out.println("C(" + number1 + "," + number2 + ") = " + combination);

        scanner.close();
    }
}
