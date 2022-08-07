package com.carlinhoshk.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlinhoshk.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
