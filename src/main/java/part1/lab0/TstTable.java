package part1.lab0;


import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.CellStyle.NullStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sergey
 * @version 1.0 *
 * Created by sergey on 30.01.2017.
 */
public class TstTable {
    public static void main(String[] args) {

        //

        CellStyle cs = new CellStyle(CellStyle.HorizontalAlign.left, CellStyle.AbbreviationStyle.crop,
                NullStyle.emptyString);
        Table t = new Table(2, BorderStyle.CLASSIC, ShownBorders.ALL, false, "");
        t.addCell("abcdef", cs);
        t.addCell("1234567777888888999999", cs);
        t.addCell("mno", cs);
        t.addCell("45689", cs);
        t.addCell("xyztuvw", cs);
        t.addCell("01234567", cs);
        System.out.println(t.render());
    }

    //
}

