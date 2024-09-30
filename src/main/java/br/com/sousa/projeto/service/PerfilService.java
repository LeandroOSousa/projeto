package br.com.sousa.projeto.service;

import br.com.sousa.projeto.dto.PerfilDTO;
import br.com.sousa.projeto.entity.PerfilEntity;
import br.com.sousa.projeto.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilService {

    @Autowired
    private PerfilRepository perfilRepository;

    public List<PerfilDTO> listarTodos() {
        List<PerfilEntity> perfils = perfilRepository.findAll();
        return perfils.stream().map(PerfilDTO::new).toList();
    }

    public void inserir(PerfilDTO perfil) {
        PerfilEntity perfilEntity = new PerfilEntity(perfil);
        perfilRepository.save(perfilEntity);
    }

    public PerfilDTO alterar(PerfilDTO perfil) {
        PerfilEntity perfilEntity = new PerfilEntity(perfil);
        return new PerfilDTO(perfilRepository.save(perfilEntity));
    }

    public void excluir(Long id) {
        PerfilEntity perfil = perfilRepository.findById(id).get();
        perfilRepository.delete(perfil);
    }

    public PerfilDTO buscarPorId(Long id) {
        return new PerfilDTO(perfilRepository.findById(id).get());
    }
}
    

