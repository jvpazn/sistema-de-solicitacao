package modelo;
import java.util.List;

public class Professor extends Usuario {
    
    private String Cradt;


    public Professor(String Cradt, String nome, String senha, String matricula, instituicao instituicao, List<Requesicao> requesicoes) {
        super(nome, senha, matricula, instituicao, requesicoes);
        this.Cradt = Cradt;
    }

    public String getCradt() {
        return this.Cradt;
    }

    public void setCradt(String Cradt) {
        this.Cradt = Cradt;
    }

}
