package com.betsdevservices.ForteApp.Repositories;

import com.betsdevservices.ForteApp.Models.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Long> {

    Trainer findByEmail(String email);
    Trainer findByPhone(String phone);
}
