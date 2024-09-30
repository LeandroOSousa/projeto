package br.com.sousa.projeto.controller;

import br.com.sousa.projeto.dto.PerfilDTO;
import br.com.sousa.projeto.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/perfil")
@CrossOrigin
public class PerfilController {

    @Autowired
    private PerfilService perfilService;

    @GetMapping
    public List<PerfilDTO> listarTodos() {
        return perfilService.listarTodos();
    }

    @PostMapping
    public void inserir(@RequestBody PerfilDTO perfil) {
        perfilService.inserir(perfil);
    }

    @PutMapping
    public PerfilDTO alterar(@RequestBody PerfilDTO perfil) {
        return perfilService.alterar(perfil);
    }

    //http://endereco/perfil/3
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        perfilService.excluir(id);
        return ResponseEntity.ok().build();
    }
}