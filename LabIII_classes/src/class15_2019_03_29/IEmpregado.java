package class15_2019_03_29;

/**
 * @author Wesley Mendes
 */
public interface IEmpregado {

    // CONSTANTES
    public final double GRATIFICACAO = 500.00;
    public final double COMISSAO = 0.02;

    // MÉTODOS ABSTRATOS
    public abstract String getNome();
    public abstract double getSalario();
}