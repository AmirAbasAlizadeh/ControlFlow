public class AllFactors {
    public static void main(String[] args) {

        getFactors(253);
        getFactors2(253);
    }

    public static void getFactors (int number) {

        if (number < 1) {
            System.out.println("Invalid value!");
        }
        for (int i = 1 ; i <= number ; i++) {

            if (number %  i == 0 ) {
                System.out.print(i + " ");
            }
        }
    }

    public static void getFactors2 (int number) {

        if (number < 1 ) {
            System.out.println("Invalid value");
        }

        int i = 1;
        System.out.println("\n");
        while (i <= number){

            if (number % i == 0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
