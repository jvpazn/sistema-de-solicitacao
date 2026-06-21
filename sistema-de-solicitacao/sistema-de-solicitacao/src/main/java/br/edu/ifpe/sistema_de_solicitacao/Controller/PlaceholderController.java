package br.edu.ifpe.sistema_de_solicitacao.Controller;

import br.edu.ifpe.sistema_de_solicitacao.DAO.UsuarioDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaceholderController {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @GetMapping("/teste/usuarios")
    public Object retornarTodosUsuarios() {
        return usuarioDAO.findAll();
    }
}