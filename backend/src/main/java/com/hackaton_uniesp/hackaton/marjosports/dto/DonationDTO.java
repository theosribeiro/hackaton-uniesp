package com.hackaton_uniesp.hackaton.marjosports.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DonationDTO {
    private String cpf;
    private String appName;
    private String valor;
}
