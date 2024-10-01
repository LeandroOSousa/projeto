package br.com.sousa.projeto.dto;

import br.com.sousa.projeto.entity.PermissaoPerfilRecursoEntity;
import org.springframework.beans.BeanUtils;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PermissaoPerfilRecursoDTO {

    private Long id;
    private PerfilDTO perfil;
    private RecursoDTO recurso;

    public PermissaoPerfilRecursoDTO(PermissaoPerfilRecursoEntity permissaoPerfilRecurso) {
        BeanUtils.copyProperties(permissaoPerfilRecurso, this);
        if(permissaoPerfilRecurso.getRecurso() != null) {
            this.recurso = new RecursoDTO(permissaoPerfilRecurso.getRecurso());
        }
        if(permissaoPerfilRecurso.getPerfil() != null) {
            this.perfil = new PerfilDTO(permissaoPerfilRecurso.getPerfil());
        }
    }
}