package class05_2019_02_22;

/**
 * @author Wesley Mendes
 */
public class ex02_matriz {

    public static void main(String[] args) {

        //matriz com 5 linhas e 4 colunas
        int mat[][] = new int[5][4];

        //preencher a matriz com valores aleatórios
        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (int)(Math.random() * 100);
            }
        }

        //exibir a matriz
        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}