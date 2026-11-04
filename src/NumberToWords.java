public class NumberToWords {
    public static void main(String[] args) {

        String n = numberToWords(4592);
        System.out.println(n);
    }

    public static String numberToWords(int number){

        if (number < 0 ) {
            System.out.println("Invalid Value");
        }
        int revNumber = reverse(number);
        String toWords = "";
        int counter = getDigitCount(number);

        while (counter != 0) {
            int rem = revNumber % 10;

                switch (rem) {
                    case 0:
                        toWords += "zero ";
                        break;
                    case 1:
                        toWords += "one ";
                        break;
                    case 2:
                        toWords += "two ";
                        break;
                    case 3:
                        toWords += "three ";
                        break;
                    case 4:
                        toWords += "four ";
                        break;
                    case 5:
                        toWords += "five ";
                        break;
                    case 6:
                        toWords += "six ";
                        break;
                    case 7:
                        toWords += "seven ";
                        break;
                    case 8:
                        toWords += "eight ";
                        break;
                    case 9:
                        toWords += "nine ";
                        break;
                }
                revNumber = revNumber / 10;
            counter -- ;
        }
        return toWords;
    }
    public static int reverse (int number ) {

        int reversed = 0;
        while (number != 0 ) {

            int rem = number % 10;
            reversed = (reversed * 10) + rem;
            number = number / 10;
        }
        return reversed;
    }
    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }
        int counter = 0;
        while (number != 0) {

            number = number / 10;
            counter ++;
        }
        return counter;
    }
}