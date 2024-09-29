package br.com.sousa.projeto.controller;

import br.com.sousa.projeto.dto.RecursoDTO;
import br.com.sousa.projeto.service.RecursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/recurso")
@CrossOrigin
public class RecursoController {
    @Autowired
    private RecursoService recursoService;

    @GetMapping
    public List<RecursoDTO> listarTodos() {
        return recursoService.listarTodos();
    }

    @PostMapping
    public void inserir(@RequestBody RecursoDTO recurso) {
        recursoService.inserir(recurso);
    }

    @PutMapping
    public RecursoDTO alterar(@RequestBody RecursoDTO recurso) {
        return recursoService.alterar(recurso);
    }

    //http://endereco/recurso/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        recursoService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
