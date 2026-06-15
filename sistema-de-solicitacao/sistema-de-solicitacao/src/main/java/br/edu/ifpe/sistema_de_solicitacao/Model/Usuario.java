package br.edu.ifpe.sistema_de_solicitacao.Model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuario")
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false, unique = true)
    private String matricula;

    @Column(name = "tipo_usuario", insertable = false, updatable = false)
    private String tipoUsuario;

    @ManyToOne
    @JoinColumn(name = "instituicao_id", nullable = false)
    private instituicao instituicao;

    @OneToMany(mappedBy = "usuario")
    private List<Requesicao> requesicoes;

    public Usuario() {}


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
