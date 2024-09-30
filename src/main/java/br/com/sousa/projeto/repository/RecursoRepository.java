package br.com.sousa.projeto.repository;

import br.com.sousa.projeto.entity.RecursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecursoRepository extends JpaRepository<RecursoEntity, Long> {
}
