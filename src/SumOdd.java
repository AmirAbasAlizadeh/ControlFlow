public class SumOdd {
    public static void main(String[] args) {

        boolean oddNum = isOdd(121);
        System.out.println(oddNum);

        int oddNums = sumOdd(100, 1000);
        System.out.println(oddNums);
    }
    public static boolean isOdd(int number){

        if (number <= 0){
            return false;
        }
        return number % 2 != 0;
    }
    public static int sumOdd(int num1, int num2){

        if (num1 > num2 || num1 < 0 || num2 < 0){
            return -1;
        }

        int sumOfOdds = 0;
        for (int i = num1 ; i <= num2 ; i++){

            if (isOdd(i)){
                sumOfOdds += i;
            }
        }
        return sumOfOdds;
    }
}
