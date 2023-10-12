package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month >= 1 && month <= 12) {
            int daysInMonth;

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daysInMonth = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInMonth = 30;
                    break;
                default: // February
                    daysInMonth = 28;
                    break;
            }

            System.out.println("The number of days in month " + month + " is: " + daysInMonth);
        } else {
            System.out.println("Wrong number!");
        }
    }
}

