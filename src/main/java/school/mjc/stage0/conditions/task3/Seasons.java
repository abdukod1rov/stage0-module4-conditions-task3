package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month >= 1 && month <= 12) {
            String season;

            switch (month) {
                case 12:
                case 1:
                case 2:
                    season = "Winter";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "Spring";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "Summer";
                    break;
                default:
                    season = "Autumn";
                    break;
            }

            System.out.println(season);
        } else {
            System.out.println("Wrong number!");
        }
    }
}

