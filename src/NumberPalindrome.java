public class NumberPalindrome {
    public static void main(String[] args) {

        boolean palindrome = isPalindrome(-12321);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(int number){

        int reversed = 0;
        int num = number;
        while(num != 0){

            int lastDigit = num % 10;
            reversed = reversed * 10;
            reversed += lastDigit;
            num = num / 10;
        }

        System.out.println(reversed);
        System.out.println(number);
        return reversed == number;
    }
}