package br.com.sousa.projeto.repository;

import br.com.sousa.projeto.entity.PerfilEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<PerfilEntity, Long>{
}
