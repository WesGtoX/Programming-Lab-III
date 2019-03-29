package class14_2019_03_29;

/**
 * @author Wesley Mendes
 */
public class FuncionarioTest {

    public static void main(String[] args) {

        Funcionario v = new Vendedor("João da Silva", 1000, 6500);
        System.out.println(v);

        Gerente g = new Gerente("Ana Maria", 2850);
        System.out.println(g);
    }
}
