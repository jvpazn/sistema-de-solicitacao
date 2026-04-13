package modelo;

import java.sql.Date;
import java.util.List;

enum StatusRequesicao {
    CONCLUIDO,
    AGUARDO,
    NEGADA
}
enum TipoRequisicao {
    MANUTENCAO_COMPUTADOR,
    SUBSTITUICAO_EQUIPAMENTO,
    MANUTENCAO_CABOS,
    INSTALACAO_EQUIPAMENTO,
    MANUTENCAO_PROJETOR,
    INSTALACAO_SOFTWARE_PADRAO,
    INSTALACAO_SOFTWARE_ESPECIFICO,
    ATUALIZACAO_SISTEMA_OPERACIONAL,
    RELATO_BUG_SISTEMA_INTERNO,
    RECUPERACAO_ARQUIVOS,
    CRIACAO_NOVO_USUARIO,
    REDEFINICAO_SENHA,
    LIBERACAO_ACESSO_PASTAS,
    CRIACAO_EMAIL_INSTITUCIONAL,
    BLOQUEIO_USUARIO,
    QUEDA_INTERNET,
    LIBERACAO_SITE_BLOQUEADO,
    CRIACAO_PONTO_REDE,
    CONFIGURACAO_WIFI,
    CONFIGURACAO_VPN
}

public class Requesicao {

    private Date data;
    private TipoRequisicao tipo;
    private String descricao;
    private List<Sala> Locais;
    private StatusRequesicao status;
    private String feedback; 


    public Requesicao(Date data, TipoRequisicao tipo, String descricao, List<Sala> Locais, StatusRequesicao status, String feedback) {
        this.data = data;
        this.tipo = tipo;
        this.descricao = descricao;
        this.Locais = Locais;
        this.status = status;
        this.feedback = feedback;
    }


    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public TipoRequisicao getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoRequisicao tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Sala> getLocais() {
        return this.Locais;
    }

    public void setLocais(List<Sala> Locais) {
        this.Locais = Locais;
    }

    public StatusRequesicao getStatus() {
        return this.status;
    }

    public void setStatus(StatusRequesicao status) {
        this.status = status;
    }

    public String getFeedback() {
        return this.feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }


}
