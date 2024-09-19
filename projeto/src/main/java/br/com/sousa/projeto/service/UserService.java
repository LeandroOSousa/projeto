package br.com.sousa.projeto.service;

import br.com.sousa.projeto.dto.UserDTO;
import br.com.sousa.projeto.entity.UserEntity;
import br.com.sousa.projeto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> listAll() {
        List<UserEntity> users = userRepository.findAll();
        return users.stream().map(UserDTO::new).toList();
    }

    public void insert(UserDTO user){
        UserEntity userEntity = new UserEntity(user);
    }

    public UserDTO update(UserDTO user){
        UserEntity userEntity = new UserEntity(user);
        return new UserDTO(userRepository.save(userEntity));
    }

    public void delete(Long id){
        UserEntity user = userRepository.findById(id).get();
        userRepository.delete(user);
    }

    public UserDTO findById(Long id){
        return new UserDTO(userRepository.findById(id).get());
    }
}
