package com.xicaum59.desafio3.epositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xicaum59.desafio3.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
