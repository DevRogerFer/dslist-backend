package com.devrogerfer.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devrogerfer.dslist.dto.GameMinDTO;
import com.devrogerfer.dslist.services.GameService;

// configurando a classe para ser um controlador (API)
@RestController
@RequestMapping(value = "/games") // mapeando o recurso
public class GameController {

	// injetando uma instância do GameService no GameController
	@Autowired
	private GameService gameService;

	@GetMapping // mapeando o método
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}

}
