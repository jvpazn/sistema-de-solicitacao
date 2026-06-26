package br.edu.ifpe.sistema_de_solicitacao.Controller;

import br.edu.ifpe.sistema_de_solicitacao.DAO.UsuarioDAO;
import br.edu.ifpe.sistema_de_solicitacao.Model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioDAO usuarioDAO;

    public UsuarioController(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

 
    @GetMapping
    public String listarTodos(Model model) {
        model.addAttribute("usuarios", usuarioDAO.findAll());
        return "usuarios"; 
    }


    @PostMapping("/criar")
    public String criar(@ModelAttribute Usuario usuario) {
        usuarioDAO.save(usuario);
        return "redirect:/usuarios"; 
    }

   
    @GetMapping("/deletar/{id}")
    public String deletar(@PathVariable Long id) {
        if (usuarioDAO.existsById(id)) {
            usuarioDAO.deleteById(id);
        }
        return "redirect:/usuarios";
    }
}
