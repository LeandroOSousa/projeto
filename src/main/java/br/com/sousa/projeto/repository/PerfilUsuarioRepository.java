package br.com.sousa.projeto.repository;

import br.com.sousa.projeto.entity.PerfilUsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilUsuarioRepository extends JpaRepository <PerfilUsuarioEntity, Long> {
}
