package com.devrogerfer.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devrogerfer.dslist.dto.GameListDTO;
import com.devrogerfer.dslist.services.GameListService;

// configuring the class to be a controller (API)
@RestController
@RequestMapping(value = "/lists") // mapping the resource
public class GameListController {

	// injecting a GameService instance into the GameController
	@Autowired
	private GameListService gameListService;

	@GetMapping // mapping method
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}

}
