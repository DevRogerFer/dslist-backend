package com.devrogerfer.dslist.dto;

import com.devrogerfer.dslist.entities.GameList;

public class GameListDTO {

	private Long id;
	private String name;

	// constructors
	public GameListDTO() {

	}

	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	// Getters methods
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
