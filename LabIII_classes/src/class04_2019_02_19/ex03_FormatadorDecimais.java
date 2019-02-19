package class04_2019_02_19;

import java.text.DecimalFormat;

/**
 *
 * @author Wesley Mendes
 */
public class FormatadorDecimais {

    public static void main(String[] args) {

        double num = Math.random() * 1000;
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");

        System.out.println("num = " + num);
        System.out.println(df.format(num));
    }
}
