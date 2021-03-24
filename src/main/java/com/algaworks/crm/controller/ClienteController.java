package com.algaworks.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.crm.model.Cliente;
import com.algaworks.crm.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository ClienteRepository;
	
	@GetMapping
	public List<Cliente> listar() {
		return ClienteRepository.findAll();
		
	}
	@PostMapping
	public Cliente adicionar(@RequestBody Cliente cliente) {
		return ClienteRepository.save(cliente);
	}
	
	@DeleteMapping
	public void remover(@RequestBody Cliente cliente) {
		ClienteRepository.delete(cliente);
	}
	
	@PutMapping
	public Cliente atualizar(@RequestBody Cliente cliente) {
		return ClienteRepository.save(cliente);
	}


}
