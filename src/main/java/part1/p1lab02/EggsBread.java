package part1.p1lab02;

/**
 * @author sergey
 * @version 1.0 *
 * Created by sergey on 30.01.2017.
 */
public class EggsBread {
    //
    public static String printPurchases(boolean hasEggs, boolean hasBread) {
       /*BODY*/
        if (hasEggs && hasBread) return "Bread"+",eggs";
        else if (hasBread) return "Bread";
        if (hasEggs) return "Eggs";
        return "";

    }

}
