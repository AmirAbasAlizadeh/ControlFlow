public class EvenDigitSum {
    public static void main(String[] args) {

        int result = getEvenDigitSum(123456789);
        System.out.println(result);
    }

    public static int getEvenDigitSum (int number){

        if (number < 0) {
            return -1;
        }

        int sumOfEvenDigits = 0;
        while (number != 0) {

            int rem = number % 10;
            if (rem % 2 == 0) {
                sumOfEvenDigits += rem;
            }
                number = number / 10;
        }
        return sumOfEvenDigits;
    }
}
