public class NumbersInWords {
    public static void main(String[] args) {
        int num = 2;
        printNumberInWord(5555);

    }

    public static void printNumberInWord(int num){

        int nm;

        while(num !=0) {
            nm = num % 10;
            num = num / 10;
            switch (nm) {
                case 0 -> System.out.println("ZERO");
                case 1 -> System.out.println("ONE");
                case -1 -> System.out.println("NEGATIVE ONE");
                case 2 -> System.out.println("TWO");
                case -2 -> System.out.println("NEGATIVE TWO");
                case 3 -> System.out.println("THREE");
                case -3 -> System.out.println("NEGATIVE THREE");
                case 4 -> System.out.println("FOUR");
                case -4 -> System.out.println("NEGATIVE FOUR");
                case 5 -> System.out.println("FIVE");
                case -5 -> System.out.println("NEGATIVE FIVE");
                case 6 -> System.out.println("SIX");
                case -6 -> System.out.println("NEGATIVE SIX");
                case 7 -> System.out.println("SEVEN");
                case -7 -> System.out.println("NEGATIVE SEVEN");
                case 8 -> System.out.println("EIGHT");
                case -8 -> System.out.println("NEGATIVE EIGHT");
                case 9 -> System.out.println("NINE");
                case -9 -> System.out.println("NEGATIVE NINE");
                default -> System.out.println("OTHER");
            }
        }


    }
}
