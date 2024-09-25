package br.com.sousa.projeto.repository;

import br.com.sousa.projeto.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

}
