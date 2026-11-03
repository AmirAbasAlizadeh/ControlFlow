public class GreaterCommonDivisor {
    public static void main(String[] args) {

        int maxDivisor = getGreatestCommonDivisor(12,30);
        System.out.println(maxDivisor);
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10){
            return -1;
        }

        int d2 = 0;
        for (int i = 1 ; i <= first ; i++){

            if (first % i == 0 && second % i == 0){
                d2 = i;
            }
        }
        return d2;
    }
}
