package part1.p1lab05;

import part1.lab0.mLib;

public class TestLab05 {

        //
        public static void main (String[] args) {
            int result = 0;
            int a;
            String ss1;

            // ss1 = mLib.varOutIntPrint(result);

            a = 1;
            result = a;
            for (int ind = 0; ind <= 31; ind++){
                result = IntegerUtils.leftShift(result);
                ss1 = mLib.varOutIntPrint(result);

                System.out.println(ss1);
            }
        }

}
