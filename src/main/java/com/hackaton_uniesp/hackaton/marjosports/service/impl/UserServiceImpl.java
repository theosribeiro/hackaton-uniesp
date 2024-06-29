package com.hackaton_uniesp.hackaton.marjosports.service.impl;

import com.hackaton_uniesp.hackaton.marjosports.dto.UserDTO;
import com.hackaton_uniesp.hackaton.marjosports.entity.UserEntity;
import com.hackaton_uniesp.hackaton.marjosports.mapper.UserMapper;
import com.hackaton_uniesp.hackaton.marjosports.repository.UserRepository;
import com.hackaton_uniesp.hackaton.marjosports.service.UserService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserService.class);
    private final UserRepository repository;
    private final UserMapper mapper;

    @Override
    public void saveUser(UserDTO user){
        try {
            log.info("Salvando Usuário");
            UserEntity entity = mapper.toEntity(user);
            repository.save(entity);
        } catch (DataIntegrityViolationException de) {
            log.error("Dados do Usuário existente. Tente novamente.", de);
            throw new RuntimeException("Dados do Usuário ja existe. Tente novamente");
        } catch (Exception e) {
            log.error("Erro ao salvar o Usuário", e);
            throw new RuntimeException("Erro ao salvar o Usuário");
        }
    }
}
