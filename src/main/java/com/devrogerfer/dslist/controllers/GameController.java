package com.devrogerfer.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devrogerfer.dslist.dto.GameDTO;
import com.devrogerfer.dslist.dto.GameMinDTO;
import com.devrogerfer.dslist.services.GameService;

// configuring the class to be a controller (API)
@RestController
@RequestMapping(value = "/games") // mapping the resource
public class GameController {

	// injecting a GameService instance into the GameController
	@Autowired
	private GameService gameService;

	// mapping the method with the id as a parameter
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		GameDTO result = gameService.findById(id);
		return result;
	}

	
	@GetMapping // mapping method
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}

}
