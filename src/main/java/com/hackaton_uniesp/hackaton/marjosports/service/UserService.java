package com.hackaton_uniesp.hackaton.marjosports.service;

import com.hackaton_uniesp.hackaton.marjosports.dto.UserDTO;
import com.hackaton_uniesp.hackaton.marjosports.entity.UserEntity;

public interface UserService {
    void saveUser(UserDTO user);

    UserEntity login(String login, String senha);
}
