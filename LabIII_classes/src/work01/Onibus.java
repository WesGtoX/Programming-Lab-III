package work01;

/**
 * @author Wesley Mendes
 */
public class Onibus {

    private int lin;
    private int col;
    private boolean poltrona[][] = new boolean[4][10];

    public Onibus() {
        poltrona[0][0] = false;
    }

    public Onibus(int lin, int col) {
        poltrona[lin][col] = true;
    }

    public boolean getPoltrona(int lin, int col) {
        return poltrona[lin][col];
    }

    public void setPoltrona(int lin, int col) {
        this.poltrona[lin][col] = true;
    }
}
