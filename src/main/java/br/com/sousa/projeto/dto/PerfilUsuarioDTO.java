package br.com.sousa.projeto.dto;

import br.com.sousa.projeto.entity.PerfilUsuarioEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
public class PerfilUsuarioDTO {

    private Long id;
    private UsuarioDTO usuario;
    private PerfilDTO perfil;

    public PerfilUsuarioDTO(PerfilUsuarioEntity perfilUsuario){
        BeanUtils.copyProperties(perfilUsuario, this);
        if(perfilUsuario.getUsuario() != null) {
            this.usuario = new UsuarioDTO(perfilUsuario.getUsuario());
        }
        if(perfilUsuario.getPerfil() != null){
           this.perfil = new PerfilDTO(perfilUsuario.getPerfil());
        }
    }

}
