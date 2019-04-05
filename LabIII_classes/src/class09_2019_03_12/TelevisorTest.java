package class09_2019_03_12;

/**
 * @author Wesley Mendes
 */
public class TelevisorTest {

    public static void main(String[] args) {

        Televisor tv = new Televisor();

        tv.setCanal(123);
        tv.setVolume(45);
        System.out.println(tv);

        tv.aumentarVolume();
        tv.aumentarVolume();
        System.out.println(tv);

        for (int i = 1; i <= 20; i++) {
            tv.reduzirVolume();
        }
        System.out.println(tv);

        tv.trocarCanal(999);
        System.out.println(tv);

        tv.setVolume(10000);
        System.out.println(tv);

    }
}
