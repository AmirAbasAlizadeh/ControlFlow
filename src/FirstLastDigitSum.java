public class FirstLastDigitSum {
    public static void main(String[] args) {

        int firstLast = sumFirstLastDigit(5);
        System.out.println(firstLast);
    }

    public static int sumFirstLastDigit(int number){

        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        while (number >= 10){

            number = number / 10;
        }
        return lastDigit + number;
    }
}
