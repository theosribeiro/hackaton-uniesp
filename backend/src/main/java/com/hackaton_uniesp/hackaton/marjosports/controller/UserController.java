package com.hackaton_uniesp.hackaton.marjosports.controller;

import com.hackaton_uniesp.hackaton.marjosports.dto.UserDTO;
import com.hackaton_uniesp.hackaton.marjosports.entity.UserEntity;
import com.hackaton_uniesp.hackaton.marjosports.mapper.UserMapper;
import com.hackaton_uniesp.hackaton.marjosports.service.UserService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static java.lang.String.format;

@Controller
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    private final UserService service;
    private final UserMapper mapper;

    @PostMapping("/save")
    public ResponseEntity<String> saveUser(@RequestBody UserDTO user) {
        log.info("Iniciando persistência do usuário");
        service.saveUser(user);
        return ResponseEntity.ok("Usuário criado com sucesso!");
    }

    @PostMapping("/login")
    public ResponseEntity<UserDTO> login(@RequestBody UserDTO user) {
        log.info(format("Iniciando Login do usuário, login %s", user.getLogin()));
        UserEntity userEntity = service.login(user.getLogin(), user.getSenha());
        return ResponseEntity.ok(mapper.toDTO(userEntity));
    }


}
