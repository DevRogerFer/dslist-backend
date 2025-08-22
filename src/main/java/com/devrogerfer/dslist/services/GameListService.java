package com.devrogerfer.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devrogerfer.dslist.dto.GameListDTO;
import com.devrogerfer.dslist.entities.GameList;
import com.devrogerfer.dslist.projections.GameMinProjection;
import com.devrogerfer.dslist.repositories.GameListRepository;
import com.devrogerfer.dslist.repositories.GameRepository;

// registering the GameService as a system component
@Service
public class GameListService {

	// injecting a GameRepository instance into the GameService
	@Autowired
	private GameListRepository gameListRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	// function that returns a list of games
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		// converting GameList to GameListDTO
		return result.stream().map(x -> new GameListDTO(x)).toList(); // operations with data sequence
	}
	
	@Transactional
	public void move(Long listId, int sourceIndex, int destinationIndex) {
		List<GameMinProjection> list = gameRepository.searchByList(listId);
		// removing the object from the list
		// according to its original position
		GameMinProjection obj = list.remove(sourceIndex);
		// inserting the object in the target position into the list
		list.add(destinationIndex, obj);
		// variables to save the minimum and maximum positions
		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;
		
		for (int i = min; i <= max; i++) {
			gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
		}
		
	}

}
