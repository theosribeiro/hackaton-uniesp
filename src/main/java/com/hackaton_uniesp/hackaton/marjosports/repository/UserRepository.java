package com.hackaton_uniesp.hackaton.marjosports.repository;

import com.hackaton_uniesp.hackaton.marjosports.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
