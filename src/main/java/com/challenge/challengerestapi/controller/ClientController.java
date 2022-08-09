package com.challenge.challengerestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.challengerestapi.model.Client;
import com.challenge.challengerestapi.repository.ClientRepository;

@RestController
@RequestMapping("/clients")
public class ClientController {

	@Autowired
	ClientRepository clientRepository;
	
	@GetMapping
	public List<Client> listClients(){
		return clientRepository.findAll();
	}
}
