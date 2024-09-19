package br.com.sousa.projeto.repository;

import br.com.sousa.projeto.dto.UsuarioDTO;
import br.com.sousa.projeto.entity.UsuarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioRepository extends JpaRepository <UsuarioEntity, Long>{
}
