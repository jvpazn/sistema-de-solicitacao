package modelo;

import java.util.ArrayList;
import java.util.List;

public class Campus {
    private Long id;
    private String nome;
    private List<Sala> salas; 

    public Campus(Long id, String nome) {
        this.id = id;
        this.nome = nome;
        this.salas = new ArrayList<>(); 
    }

    public void adicionarSala(Sala sala) {
        this.salas.add(sala);
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public List<Sala> getSalas() { return salas; }
}