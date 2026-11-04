public class FourPackProblem {
    public static void main(String[] args) {

        boolean checkPack = canPack(3,6,1);
        System.out.println(checkPack);
    }

    public static boolean canPack (int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int bigWeight = 5;
        int smallWeight = 1;
        for (int i = 0; i <= bigCount; i++){

            for (int j = 0; j<= smallCount; j++) {

                if ((i * bigWeight) + (j * smallWeight) == goal) {

                    int total = (i * bigWeight) + (j * smallWeight);
                    System.out.println(total);
                    return true;
                }
            }
        }
        return false;
    }
}
