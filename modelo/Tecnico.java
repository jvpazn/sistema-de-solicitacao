package modelo;

import java.util.List;

public class Tecnico extends Usuario{
    
public enum EspecialidadeTecnico {
    SUPORTE_LOCAL,
    SISTEMAS_E_ACESSOS,
    INFRAESTRUTURA_REDES
}

    private EspecialidadeTecnico EspecialidadeTecnico;


    public Tecnico(EspecialidadeTecnico EspecialidadeTecnico, String nome, String senha, String matricula, instituicao instituicao, List<Requesicao> requesicoes) {
        super(nome, senha, matricula, instituicao, requesicoes);
        this.EspecialidadeTecnico = EspecialidadeTecnico;
    }


    public EspecialidadeTecnico getEspecialidadeTecnico() {
        return this.EspecialidadeTecnico;
    }

    public void setEspecialidadeTecnico(EspecialidadeTecnico EspecialidadeTecnico) {
        this.EspecialidadeTecnico = EspecialidadeTecnico;
    }


}
