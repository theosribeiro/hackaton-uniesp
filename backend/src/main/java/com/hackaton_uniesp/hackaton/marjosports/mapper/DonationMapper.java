//package com.hackaton_uniesp.hackaton.marjosports.mapper;
//
//import com.hackaton_uniesp.hackaton.marjosports.dto.DonationDTO;
//import com.hackaton_uniesp.hackaton.marjosports.dto.UserDTO;
//import com.hackaton_uniesp.hackaton.marjosports.entity.DonationEntity;
//import com.hackaton_uniesp.hackaton.marjosports.entity.UserEntity;
//import org.mapstruct.Mapper;
//import org.mapstruct.factory.Mappers;
//
//import java.util.Objects;
//
//@Mapper(componentModel = "spring")
//public interface DonationMapper {
//    DonationMapper INSTANCE = Mappers.getMapper( DonationMapper.class );
//
//
//    default DonationDTO toDTO(DonationEntity entity) {
//        if (Objects.isNull(entity))
//            return null;
//        return DonationDTO.builder()
//                .cpf(entity.getCpf())
//                .email(entity.getEmail())
//                .nome(entity.getNome())
//                .senha(entity.getSenha())
//                .login(entity.getLogin())
//                .tipoUsuario(entity.getTipoUsuario())
//                .build();
//    }
//
//    default DonationEntity toEntity(DonationDTO dto){
//        if (Objects.isNull(dto))
//            return null;
//        return DonationEntity.builder()
//                .cpf(dto.getCpf())
//                .email(dto.getEmail())
//                .nome(dto.getNome())
//                .senha(dto.getSenha())
//                .login(dto.getLogin())
//                .tipoUsuario(dto.getTipoUsuario())
//                .build();
//    }
//}
