package class07_2019_03_01;

/**
 * @author Wesley Mendes
 */
public class Bomba {

    public boolean status;

    public void ligar(int segundos) {

        this.status = true;
        System.out.println("Bomba ligada.");

        for (int i = 1; i < segundos; i++) {

            try {
                Thread.sleep(1000);     //Aguarda 1 segundo
            } catch (Exception e) {

            }
            System.out.println("A bomba será desligada em: " + (segundos-i)
                + " segundos.");
        }
        desligar();
        System.out.println("Bomba desligada");
    }

    public void desligar() {
        this.status = false;
    }
}
