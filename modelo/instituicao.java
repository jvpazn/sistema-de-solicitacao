package modelo;

import java.util.List;


enum Ensino{
    INFANTIL,
    FUNDAMENTAL_I,
    FUNDAMENTAL_II,
    MEDIO,
    SUPERIOR
}

public class instituicao {
    private String codigoInep;
    private List<Ensino> ensino;


    public instituicao(String codigoInep, List<Ensino> ensino) {
        this.codigoInep = codigoInep;
        this.ensino = ensino;
    }

    public String getCodigoInep() {
        return this.codigoInep;
    }

    public void setCodigoInep(String codigoInep) {
        this.codigoInep = codigoInep;
    }

    public List<Ensino> getEnsino() {
        return this.ensino;
    }

    public void setEnsino(List<Ensino> ensino) {
        this.ensino = ensino;
    }

}
