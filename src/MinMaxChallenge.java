import java.util.Scanner;
public class MinMaxChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 0;
        while(true) {
            System.out.println("Enter a number (or anything except a number to quit)");
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (max == 0) {
                    max = number;
                } else {
                    if (max < number) {
                        max = number;
                    }
                }
                if (min == 0) {
                    min = number;
                } else {
                    if (min > number){
                        min = number;
                    }
                }
            } catch (NumberFormatException nfe){
                break;
            }
        }
        System.out.println("The biggest number entered by user is " + max + " and the least number entered is " + min);
    }
}
