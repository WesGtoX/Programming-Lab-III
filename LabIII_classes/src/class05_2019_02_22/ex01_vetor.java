package class05_2019_02_22;

/**
 * @author Wesley Mendes
 */
public class ex01_vetor {

    //psvm
    public static void main(String[] args) {

        double vet[] = new double[10];

        //fori
        for (int i = 0; i < vet.length; i++) {
            vet[i] = Math.random() * 1000;
        }

        //sout
        System.out.println("Tamanho: " + vet.length);

        for(double valor: vet) {
            System.out.println(valor);
        }
    }
}
