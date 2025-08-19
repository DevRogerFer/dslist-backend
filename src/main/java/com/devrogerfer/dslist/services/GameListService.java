package com.devrogerfer.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devrogerfer.dslist.dto.GameListDTO;
import com.devrogerfer.dslist.entities.GameList;
import com.devrogerfer.dslist.repositories.GameListRepository;

// registering the GameService as a system component
@Service
public class GameListService {

	// injecting a GameRepository instance into the GameService
	@Autowired
	private GameListRepository gameListRepository;
	
	// function that returns a list of games
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		// converting GameList to GameListDTO
		return result.stream().map(x -> new GameListDTO(x)).toList(); // operations with data sequence
	}

}
