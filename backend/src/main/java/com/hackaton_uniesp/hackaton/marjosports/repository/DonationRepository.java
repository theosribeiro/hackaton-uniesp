package com.hackaton_uniesp.hackaton.marjosports.repository;

import com.hackaton_uniesp.hackaton.marjosports.entity.DonationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepository extends JpaRepository<DonationEntity, Long> {
}
