public class Main {
    public static void main(String[] args) {

        int switchCase = 3;
        switch (switchCase) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value was 3 or 4 or 5");
                System.out.println("Actually the value was " + switchCase);
                break;
            default:
                System.out.println("Value was not 1, 2, 3, 4 or 5");
        }
        String month = "JANUARY";
        String i = quarterMonth(month);
        System.out.println(i);

        char letter = 'A';
        switch (letter) {
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("DOG");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("Letter " + letter + " Not found");
        }

        dayOfWeek(0);
        dayOfWeek(1);
        dayOfWeek(2);
        dayOfWeek(3);
        dayOfWeek(4);
        dayOfWeek(5);
        dayOfWeek(6);
        dayOfWeek(7);
    }


    public static String quarterMonth(String month) {

        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad response";
                yield badResponse;
            }
        };
    }

    public static void dayOfWeek(int day) {

        String dayOfWeek =  switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
        System.out.println(day + " stands for " + dayOfWeek);
    }

    public static void printWeekDay(int day){

        String dayOfWeek = "invalid day";
        if (day == 0){
            dayOfWeek = "Sunday";
        } else if (day == 1){
            dayOfWeek = "Monday";
        } else if (day == 2){
            dayOfWeek = "Tuesday";
        } else if (day == 3){
            dayOfWeek = "Wednesday";
        } else if (day == 4){
            dayOfWeek = "Thursday";
        } else if (day == 5){
            dayOfWeek = "Friday";
        } else if (day == 6){
            dayOfWeek = "Saturday";
        }
        System.out.println(day + " is " + dayOfWeek);
    }
}