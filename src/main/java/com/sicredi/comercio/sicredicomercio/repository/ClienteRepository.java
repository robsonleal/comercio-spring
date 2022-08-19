package com.sicredi.comercio.sicredicomercio.repository;

import com.sicredi.comercio.sicredicomercio.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
