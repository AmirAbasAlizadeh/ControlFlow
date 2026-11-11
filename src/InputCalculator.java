import java.util.InputMismatchException;
import java.util.Scanner;
public class InputCalculator {
    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        while (true) {
            try {
                System.out.println("Enter an integer number");
                int input = scanner.nextInt();
                sum += input;
                counter++;
            } catch (InputMismatchException ime) {
                System.out.println("Not an integer input. Quiting the program");
                break;
            }
        }
        int avg = (int)(Math.round((double)sum / counter));
        System.out.println("Sum : " + sum + " Average : " + avg);
    }
}
