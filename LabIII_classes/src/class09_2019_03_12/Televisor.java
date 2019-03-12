package class09_2019_03_12;

/**
 * @author Wesley Mendes
 */
public class Televisor {

    private int volume;
    private int canal;

    // metodo set
    public void setVolume(int volume) {

        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            System.out.println("O volume informado não é valido.");
        }
    }

    public void setCanal(int canal) {

        if (canal > 1 && canal <= 500) {
            this.canal = canal;
        } else {
            System.out.println("O canal informado não é valido.");
        }
    }

    public int getVolume() {
        return this.volume;
    }

    public int getCanal() {
        return this.canal;
    }

    public void aumentarVolume() {
        setVolume(getVolume() + 1);
    }

    public void reduzirVolume() {
        setVolume(getVolume() - 1);
    }

    public void trocarCanal(int canal) {
        setCanal(canal);
    }

    @Override
    public String toString() {
        return "Canal: " + getCanal() + "\n" +
                "Volume: " + getVolume() + "\n";
    }
}
