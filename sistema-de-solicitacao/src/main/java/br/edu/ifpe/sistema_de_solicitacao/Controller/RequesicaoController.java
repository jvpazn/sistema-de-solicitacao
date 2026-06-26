package br.edu.ifpe.sistema_de_solicitacao.Controller;

import br.edu.ifpe.sistema_de_solicitacao.DAO.RequesicaoDAO;
import br.edu.ifpe.sistema_de_solicitacao.Model.Requesicao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/requisicoes")
public class RequesicaoController {

    private final RequesicaoDAO requesicaoDAO;

    public RequesicaoController(RequesicaoDAO requesicaoDAO) {
        this.requesicaoDAO = requesicaoDAO;
    }


    @GetMapping
    public String listarTodas(Model model) {
        model.addAttribute("requisicoes", requesicaoDAO.findAll());
        return "requisicoes"; 
    }


    @PostMapping("/criar")
    public String criar(@ModelAttribute Requesicao requesicao) {
        requesicaoDAO.save(requesicao);
        return "redirect:/requisicoes";
    }

 
    @PostMapping("/atualizar/{id}")
    public String atualizar(@PathVariable Long id, @ModelAttribute Requesicao requesicaoAtualizada) {
        if (requesicaoDAO.existsById(id)) {
            requesicaoAtualizada.setId(id);
            requesicaoDAO.save(requesicaoAtualizada);
        }
        return "redirect:/requisicoes";
    }

    
    @GetMapping("/deletar/{id}")
    public String deletar(@PathVariable Long id) {
        if (requesicaoDAO.existsById(id)) {
            requesicaoDAO.deleteById(id);
        }
        return "redirect:/requisicoes";
    }
}
