package com.hackaton_uniesp.hackaton.marjosports.service.impl;

import com.hackaton_uniesp.hackaton.marjosports.dto.DonationDTO;
import com.hackaton_uniesp.hackaton.marjosports.dto.UserDTO;
import com.hackaton_uniesp.hackaton.marjosports.entity.UserEntity;
import com.hackaton_uniesp.hackaton.marjosports.service.DonationService;
import com.hackaton_uniesp.hackaton.marjosports.service.UserService;
import com.hackaton_uniesp.hackaton.utils.enums.hackatonFeignClient.HackatonFeignClient;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DonationServiceImpl implements DonationService {

    private static final Logger log = LoggerFactory.getLogger(UserService.class);

//    @Override
//    public void makeDonation(DonationDTO donation){
//        try {
//            log.info("Salvando Doacao");
//            HackatonFeignClient.
//
//        } catch (Exception e) {
//            log.error("Erro ao salvar o Usuário", e);
//            throw new RuntimeException("Erro ao salvar o Usuário");
//        }
//    }
}
