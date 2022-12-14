package com.challenge.challengerestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.challengerestapi.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

	Client findById(long id);
}
