package class05_2019_02_22;

/**
 * @author Wesley Mendes
 */
public class ex03_funcoes {

    public static void main(String[] args) {

        double vet[] = new double[10];

        gerarNumeros(vet);
        System.out.println("Soma = " + somarVetor(vet));

        mostrarVetor(vet);
    }

    //gerar números aleatórios
    public static void gerarNumeros(double v[]) {

        for (int i = 0; i < v.length; i++) {

            v[i] = Math.random() * 100;
        }
    }

    public static double somarVetor(double v[]) {

        double soma = 0;

        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }
        return soma;
    }

    public static void mostrarVetor(double v[]) {

        for (int i = 0; i < v.length; i++) {

            System.out.println(String.format("Posição %d valor %.2f", i, v[i]));

        }
    }
}
