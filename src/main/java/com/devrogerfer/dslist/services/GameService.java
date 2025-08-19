package com.devrogerfer.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devrogerfer.dslist.dto.GameMinDTO;
import com.devrogerfer.dslist.entities.Game;
import com.devrogerfer.dslist.repositories.GameRepository;

// registrando o GameService como um componente do sistema
@Service
public class GameService {

	// injetando uma instância do GameRepository no GameService
	@Autowired
	private GameRepository gameRepository;

	// função que retorna uma lista de games
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		// transforma uma lista de Game em GameMinDTO
		return result.stream().map(x -> new GameMinDTO(x)).toList(); // operações com sequência de dados
	}

}
