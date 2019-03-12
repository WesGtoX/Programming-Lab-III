package class08_2019_03_08;

/**
 * @author Wesley Mendes
 */
public class Pessoa {

    private String nome;
    private double peso;
    private double altura;
    public String usuario;
    public String senha;

    // Metodos SET = Enviar dados
    public void setNome(String nome) {
        if (nome.length() > 1) {
            this.nome = nome;
        }
        else {
            System.out.println("O tamanho do nome deve conter no minimo 2 caracteres");
        }
    }
    public void setPeso(double peso) {
        if(peso > 0 && peso < 500) {
            this.peso = peso;
        }
        else{
            System.out.println("O peso informado não é valido.");
        }
    }
    public void setAltura(double altura) {
        if(altura > 0.00 && altura <= 2.10) {
            this.altura = altura;
        }
        else{
            System.out.println("Essa altura não existe.");
        }
    }

    //Metodo GET = Retornar dados
    public String getNome(){
        return this.nome;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome+"\n"+
                "Peso: " + this.peso+"\n"+
                "Altura: " + this.altura+"\n"+
                "Usuraio: " + this.usuario+"\n"+
                "Senha: " + this.senha+"\n";
    }
}

//public void setPeso(double peso){}
//public void getNome(){}