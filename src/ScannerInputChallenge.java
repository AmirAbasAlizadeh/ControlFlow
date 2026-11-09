import java.util.Scanner;
public class ScannerInputChallenge {
    public static void main(String[] args) {

        int i = 1;
        double sums = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number " + i + " :");
            try {
                String number = scanner.nextLine();
                double num = Double.parseDouble(number);
                sums += num;
                i++;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input. Enter an integer!");
            }
        } while (i <= 5);
        System.out.println("The sum of the inputs is: " + sums);
    }


}
