public class PerfectNumber {
    public static void main(String[] args) {

        boolean isItPerfect = perfectNumber(33550336);
        System.out.println(isItPerfect);
    }

    public static boolean perfectNumber(int number) {

        if (number < 1){
            return false;
        }

        int perfectNum = 0;
        for (int i = 1; i <= number / 2; i++) {

            if (number % i == 0){

                perfectNum += i;
            }
        }
        System.out.println(perfectNum);
        return perfectNum == number;
    }
}
