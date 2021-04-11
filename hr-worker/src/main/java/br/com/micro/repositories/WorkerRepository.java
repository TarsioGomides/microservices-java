package br.com.micro.repositories;

import br.com.micro.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WorkerRepository extends JpaRepository<Worker, Long> {

}