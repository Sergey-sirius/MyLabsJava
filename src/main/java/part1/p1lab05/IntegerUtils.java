package part1.p1lab05;

/**
 * @author sergey
 * @version 1.0 *
 * Created by sergey on 30.01.2017.
 */
public class IntegerUtils {

    // Byte left
    public static int leftShift(int arg) {
        if (arg < 0) {
            arg = arg << 1|1;
            // OR arg = arg ^ 0b00000000000000000000000000000001;
        } else {
            arg = arg<<1;
        }
        return arg;
    }
}
