package com.devrogerfer.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devrogerfer.dslist.dto.GameDTO;
import com.devrogerfer.dslist.dto.GameMinDTO;
import com.devrogerfer.dslist.entities.Game;
import com.devrogerfer.dslist.projections.GameMinProjection;
import com.devrogerfer.dslist.repositories.GameRepository;

// registering the GameService as a system component
@Service
public class GameService {

	// injecting a GameRepository instance into the GameService
	@Autowired
	private GameRepository gameRepository;
	
	// creating method to search by Id and
	// ensuring that the operation in the DB will take place in 
	// compliance with the principles of transactions (ACID)
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}

	// function that returns a list of games
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		// transforms a Game list into GameMinDTO
		return result.stream().map(x -> new GameMinDTO(x)).toList(); // operations with data sequence
	}
	
	// function that returns a list of games
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		// transforms a Game list into GameMinDTO
		return result.stream().map(x -> new GameMinDTO(x)).toList(); // operations with data sequence
	}

}
