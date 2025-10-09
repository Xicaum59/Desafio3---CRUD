package com.xicaum59.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xicaum59.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
