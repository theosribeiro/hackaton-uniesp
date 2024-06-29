package com.hackaton_uniesp.hackaton.marjosports.controller;

import com.hackaton_uniesp.hackaton.marjosports.dto.DonationDTO;
import com.hackaton_uniesp.hackaton.marjosports.dto.UserDTO;
import com.hackaton_uniesp.hackaton.marjosports.service.DonationService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/donation")
public class DonationController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    private final DonationService service;

//    @PostMapping
//    public ResponseEntity<String> saveUser(@RequestBody DonationDTO donation) {
//        log.info("Iniciando persistência da doacao");
//        service.makeDonation(donation);
//        return ResponseEntity.ok("Doacao criada com sucesso!");
//    }
}
