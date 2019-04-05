package class11_2019_03_19;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wesley Mendes
 */
public class RetanguloTest {

    public static void main(String[] args) {

        Retangulo ret1 = new Retangulo();
        ret1.setLargura(10);
        ret1.setComprimento(15);
        System.out.println(ret1);

        Retangulo ret2 = new Retangulo(12,15);
        System.out.println(ret2);

        // Lista Dinâmica de Retângulo
        // cria uma lista dinâmica em que cada elemento será um objeto da classe 'Retangulo'
        List<Retangulo> lista = new ArrayList<>();      // cria lista vazia

        lista.add(new Retangulo(2,3));
        lista.add(new Retangulo(3,6));
        lista.add(new Retangulo(4,2));
        lista.add(new Retangulo(5,8));

        System.out.println("Total de retângulo: " + lista.size());
        lista.remove(1);
        System.out.println("Total de retângulo: " + lista.size());

        for (Retangulo r: lista) {
            System.out.println();
        }

        for (int i = 0; i < lista.size(); i++) {
            Retangulo r = lista.get(i);
            System.out.println(r);

        }
    }
}
