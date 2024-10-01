package br.com.sousa.projeto.service;

import br.com.sousa.projeto.dto.PermissaoPerfilRecursoDTO;
import br.com.sousa.projeto.entity.PermissaoPerfilRecursoEntity;
import br.com.sousa.projeto.repository.PermissaoPerfilRecursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissaoPerfilRecursoService {

    @Autowired
    private PermissaoPerfilRecursoRepository permissaoPerfilRecursoRepository;

    public List<PermissaoPerfilRecursoDTO> listarTodos(){
        List<PermissaoPerfilRecursoEntity> permissaoPerfilRecurso = permissaoPerfilRecursoRepository.findAll();
        return permissaoPerfilRecurso.stream().map(PermissaoPerfilRecursoDTO::new).toList();
    }

    public void inserir(PermissaoPerfilRecursoDTO permissaoPerfilRecurso) {
        PermissaoPerfilRecursoEntity permissaoPerfilRecursoEntity = new PermissaoPerfilRecursoEntity(permissaoPerfilRecurso);
        permissaoPerfilRecursoRepository.save(permissaoPerfilRecursoEntity);
    }

    public PermissaoPerfilRecursoDTO alterar(PermissaoPerfilRecursoDTO permissaoPerfilRecurso) {
        PermissaoPerfilRecursoEntity permissaoPerfilRecursoEntity = new PermissaoPerfilRecursoEntity(permissaoPerfilRecurso);
        return new PermissaoPerfilRecursoDTO(permissaoPerfilRecursoRepository.save(permissaoPerfilRecursoEntity));
    }

    public void excluir(Long id) {
        PermissaoPerfilRecursoEntity permissaoPerfilRecurso = permissaoPerfilRecursoRepository.findById(id).get();
        permissaoPerfilRecursoRepository.delete(permissaoPerfilRecurso);
    }

    public PermissaoPerfilRecursoDTO buscarPorId(Long id) {
        return new PermissaoPerfilRecursoDTO(permissaoPerfilRecursoRepository.findById(id).get());
    }
}

