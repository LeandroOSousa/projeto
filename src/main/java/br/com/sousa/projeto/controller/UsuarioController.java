package br.com.sousa.projeto.controller;

import java.util.List;

import br.com.sousa.projeto.dto.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.sousa.projeto.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
@CrossOrigin
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public List<UsuarioDTO> listarTodos(){
		return usuarioService.listarTodos();
	}

	@PostMapping
	public void inserir(@RequestBody UsuarioDTO usuario) {
		usuarioService.inserir(usuario);
	}
	
	@PutMapping
	public UsuarioDTO alterar(@RequestBody UsuarioDTO usuario) {
		return usuarioService.alterar(usuario);
	}
	
	//http://endereco/usuario/3
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
		usuarioService.excluir(id);
		return ResponseEntity.ok().build();
	}
}
