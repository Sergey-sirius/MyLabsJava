package part1.lab0;

/**
 * @author sergey
 * @version 1.0 *
 * Created by sergey on 30.01.2017.
 */
public class mLib {
    // Форматированый вывод на экран
    public static String varOutIntPrint (int value){
        String result = "Bin-> "+String.format("%32s", Integer.toBinaryString(value)).replace(' ', '0')+" Dec ->"+value;
        return result;
    }
}
