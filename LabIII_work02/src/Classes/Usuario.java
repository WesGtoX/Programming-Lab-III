package Classes;

/**
 *
 * @author wesley, weslley
 */
public class Usuario {
    
    private String login;
    private String nome;
    private String sobrenome;
    private String senha;
    private String confirmSenha;
    private String perfil;
    
    public Usuario() {
        
    }    

    public Usuario(String login, String nome, String sobrenome, String senha, String confirmSenha, String perfil) {
        this.login = login;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.senha = senha;
        this.confirmSenha = confirmSenha;
        this.perfil = perfil;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmSenha() {
        return confirmSenha;
    }

    public void setConfirmSenha(String confirmSenha) {
        this.confirmSenha = confirmSenha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    
    
}
