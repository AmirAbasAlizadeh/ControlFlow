public class NumbersOfDaysInMonth {
    public static void main(String[] args) {

        boolean leapYear = isLeapYear(2000);
        System.out.println(leapYear);
        getDaysInMonth(2000, 2);
        getDaysInMonth(2018, 2);
        getDaysInMonth(2000, 12);
        getDaysInMonth(2000, 6);


    }
    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static void getDaysInMonth(int year, int month){

        if (month < 1 || month > 12){
            return ;
        }
        if (year < 1 || year > 9999){
            return ;
        }

        boolean leap = isLeapYear(year);

        switch (month) {
            case 1:
                System.out.println(31);
                break;
            case 2:
                if (leap) {
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }
                break;
            case 3:
                System.out.println(31);
                break;
            case 4:
                System.out.println(30);
                break;
            case 5:
                System.out.println(31);
                break;
            case 6:
                System.out.println(30);
                break;
            case 7:
                System.out.println(31);
                break;
            case 8:
                System.out.println(31);
                break;
            case 9:
                System.out.println(30);
                break;
            case 10:
                System.out.println(31);
                break;
            case 11:
                System.out.println(30);
                break;
            case 12:
                System.out.println(31);
                break;
            default:
                System.out.println(-1);
        }

    }
}
