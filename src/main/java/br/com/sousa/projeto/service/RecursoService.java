package br.com.sousa.projeto.service;


import br.com.sousa.projeto.dto.RecursoDTO;
import br.com.sousa.projeto.dto.RecursoDTO;
import br.com.sousa.projeto.entity.RecursoEntity;
import br.com.sousa.projeto.entity.RecursoEntity;
import br.com.sousa.projeto.repository.RecursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecursoService {

    @Autowired
    private RecursoRepository recursoRepository;

    public List<RecursoDTO> listarTodos(){
        List<RecursoEntity> recursos = recursoRepository.findAll();
        return recursos.stream().map(RecursoDTO::new).toList();
    }
    public void inserir(RecursoDTO recurso){
        RecursoEntity recursoEntity = new RecursoEntity(recurso);
        recursoRepository.save(recursoEntity);
    }
    public RecursoDTO alterar(RecursoDTO recurso) {
        RecursoEntity recursoEntity = new RecursoEntity(recurso);
        return new RecursoDTO(recursoRepository.save(recursoEntity));
    }

    public void excluir(Long id) {
        RecursoEntity recurso = recursoRepository.findById(id).get();
        recursoRepository.delete(recurso);
    }
}
