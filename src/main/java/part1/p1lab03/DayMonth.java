package part1.p1lab03;

/**
 * @author sergey
 * @version 1.0 *
 * Created by sergey on 30.01.2017.
 */
public class DayMonth {
    //
    public static String getMonthOfYear(int number) {
        /*BODY*/
        switch (number){
            case 1: return "january";
            case 2: return "february";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "";
        }
    }

}
