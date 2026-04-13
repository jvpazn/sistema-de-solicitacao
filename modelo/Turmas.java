package modelo;

public class Turmas {
    private Long id;
    private String nome;
    private Campus campus; 
    public Turmas(Long id, String nome, Campus campus) {
        this.id = id;
        this.nome = nome;
        this.campus = campus;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Campus getCampus() { return campus; }
    public void setCampus(Campus campus) { this.campus = campus; }
    
    @Override
    public String toString() {
        return nome;
    }
}