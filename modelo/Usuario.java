package modelo;

import java.util.List;

public class Usuario {
    private String nome;
    private String senha;
    private String matricula;
    private instituicao instituicao;
    private List<Requesicao> requesicoes;


    public Usuario(String nome, String senha, String matricula, instituicao instituicao, List<Requesicao> requesicoes) {
        this.nome = nome;
        this.senha = senha;
        this.matricula = matricula;
        this.instituicao = instituicao;
        this.requesicoes = requesicoes;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public instituicao getInstituicao() {
        return this.instituicao;
    }

    public void setInstituicao(instituicao instituicao) {
        this.instituicao = instituicao;
    }

    public List<Requesicao> getRequesicoes() {
        return this.requesicoes;
    }

    public void setRequesicoes(List<Requesicao> requesicoes) {
        this.requesicoes = requesicoes;
    }

}
