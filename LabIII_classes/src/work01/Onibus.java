package work01;

/**
 * @author Wesley Mendes
 */
public class Onibus {

    private boolean poltrona[][] = new boolean[4][10];
    private double lin;
    private double col;

    public Onibus() {
        this(false, 0, 0);
    }

    public Onibus(boolean poltrona, int lin, int col) {
        this.poltrona[lin][col] = false;
    }

    public boolean[][] getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(boolean[][] poltrona) {
        this.poltrona = poltrona;
    }

    public double getLin() {
        return lin;
    }

    public void setLin(double lin) {
        this.lin = lin;
    }

    public double getCol() {
        return col;
    }

    public void setCol(double col) {
        this.col = col;
    }
}
