package modelo;
import java.util.List;

public class Aluno extends Usuario {
    
    private Turmas turma;


    public Aluno(Turmas turma, String nome, String senha, String matricula, instituicao instituicao, List<Requesicao> requesicoes) {
        super(nome, senha, matricula, instituicao, requesicoes);
        this.turma = turma;
    }
    

    public Turmas getTurma() {
        return this.turma;
    }

    public void setTurma(Turmas turma) {
        this.turma = turma;
    }



}
