package class16_2019_04_02;

/**
 * @author Wesley Mendes
 */
public abstract class Forma {

    //metodos abstratos
    public abstract String getNome();
    public abstract double getArea();

    @Override
    public String toString() {
        return "Forma = " + getNome() + "\n" +
                "Área = " + String.format("%.2f", getArea()) + "\n";
    }
}
