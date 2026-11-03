public class SharedDigit {
    public static void main(String[] args) {

        boolean sharedDigitChecker = hasSharedDigit(81,87);
        System.out.println(sharedDigitChecker);
    }

    public static boolean hasSharedDigit(int num1, int num2){

        if ((num1 < 10 || num1 > 100) || (num2 < 10 || num2 > 100)){
            return false;
        }

        while (num1 != 0){

            int rem1 = num1 % 10;
            int clone = num2;
            while (clone != 0) {

                int rem2 = clone % 10;
                if (rem1 == rem2){
                    return true;
                }
                clone = clone / 10;
            }
            num1 = num1 / 10;
        }
        return false;
    }
}
