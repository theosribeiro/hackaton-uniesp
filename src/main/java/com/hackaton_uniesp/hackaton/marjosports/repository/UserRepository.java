package com.hackaton_uniesp.hackaton.marjosports.repository;

import com.hackaton_uniesp.hackaton.marjosports.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByLogin(String login);

}
