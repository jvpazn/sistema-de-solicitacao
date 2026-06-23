package br.edu.ifpe.sistema_de_solicitacao.Controller;

import br.edu.ifpe.sistema_de_solicitacao.DAO.RequesicaoDAO; //
import br.edu.ifpe.sistema_de_solicitacao.Model.Requesicao; //
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/requesicoes")
public class RequesicaoController {

    private final RequesicaoDAO requesicaoDAO;

    public RequesicaoController(RequesicaoDAO requesicaoDAO) {
        this.requesicaoDAO = requesicaoDAO;
    }

    @GetMapping
    public List<Requesicao> listarTodas() {
        return requesicaoDAO.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Requesicao> buscarPorId(@PathVariable Long id) {
        Optional<Requesicao> requesicao = requesicaoDAO.findById(id);
        if (requesicao.isPresent()) {
            return ResponseEntity.ok(requesicao.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Requesicao> criar(@RequestBody Requesicao requesicao) {
        Requesicao novaRequesicao = requesicaoDAO.save(requesicao);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaRequesicao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Requesicao> atualizar(@PathVariable Long id, @RequestBody Requesicao requesicaoAtualizada) {
        if (!requesicaoDAO.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        requesicaoAtualizada.setId(id);
        Requesicao salva = requesicaoDAO.save(requesicaoAtualizada);
        return ResponseEntity.ok(salva);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (!requesicaoDAO.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        requesicaoDAO.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}