package com.hackaton_uniesp.hackaton.marjosports.mapper;

import com.hackaton_uniesp.hackaton.marjosports.dto.UserDTO;
import com.hackaton_uniesp.hackaton.marjosports.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Objects;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );


    default UserDTO toDTO(UserEntity entity) {
        if (Objects.isNull(entity))
            return null;
        return UserDTO.builder()
                .id(entity.getId())
                .cpf(entity.getCpf())
                .email(entity.getEmail())
                .nome(entity.getNome())
                .senha(entity.getSenha())
                .login(entity.getLogin())
                .tipoUsuario(entity.getTipoUsuario())
                .build();
    }

    default UserEntity toEntity(UserDTO dto){
        if (Objects.isNull(dto))
            return null;
        return UserEntity.builder()
                .id(dto.getId())
                .cpf(dto.getCpf())
                .email(dto.getEmail())
                .nome(dto.getNome())
                .senha(dto.getSenha())
                .login(dto.getLogin())
                .tipoUsuario(dto.getTipoUsuario())
                .build();
    }
}
