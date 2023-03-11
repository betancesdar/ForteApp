package com.betsdevservices.ForteApp.Repositories;

import com.betsdevservices.ForteApp.Models.Trainee;
import com.betsdevservices.ForteApp.Models.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraineeRepository extends JpaRepository<Trainee,Long>{

    Trainee findByTrainer(Trainer trainer);
}
