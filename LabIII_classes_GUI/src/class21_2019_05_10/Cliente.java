/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class21_2019_05_10;

import java.io.Serializable;

/**
 *
 * @author wesley
 */
public class Cliente implements Serializable {  // Permite salvar dados de arquivo e criar dados de arquivo
    
    private String id;
    private String nome;
    private String sexo;
    private String escolaridade;
    private String profissao;
    private String telefoneFixo;
    private String telefoneCelular;
    private String email;
    
    public Cliente() {
    }

    public Cliente(String id, String nome, String sexo, String escolaridade, String profissao, String telefoneFixo, String telefoneCelular, String email) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.escolaridade = escolaridade;
        this.profissao = profissao;
        this.telefoneFixo = telefoneFixo;
        this.telefoneCelular = telefoneCelular;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
