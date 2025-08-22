package com.devrogerfer.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devrogerfer.dslist.dto.GameListDTO;
import com.devrogerfer.dslist.dto.GameMinDTO;
import com.devrogerfer.dslist.dto.ReplacementDTO;
import com.devrogerfer.dslist.services.GameListService;
import com.devrogerfer.dslist.services.GameService;

// configuring the class to be a controller (API)
@RestController
@RequestMapping(value = "/lists") // mapping the resource
public class GameListController {

	// injecting a GameListService and GameService instance into the GameController
	@Autowired
	private GameListService gameListService;
	@Autowired
	private GameService gameService;

	@GetMapping // mapping method
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{listId}/games") // mapping method
	public List<GameMinDTO> findByList(@PathVariable Long listId) {
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
	}
	
	@PostMapping(value = "/{listId}/replacement") // mapping method
	public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
		gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
	}	

}
