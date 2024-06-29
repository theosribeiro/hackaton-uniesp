package com.hackaton_uniesp.hackaton.utils.enums.hackatonFeignClient;

import com.hackaton_uniesp.hackaton.marjosports.dto.DonationDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "hackaton-api", url = "https://hackathon.marjosports.com.br/hackathon")
public interface HackatonFeignClient {

    @PostMapping
    public void sendDoacao(@RequestBody DonationDTO donation);
}
