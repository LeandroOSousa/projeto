package br.com.sousa.projeto.repository;

import br.com.sousa.projeto.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends JpaRepository <UserEntity, Long>{
}
