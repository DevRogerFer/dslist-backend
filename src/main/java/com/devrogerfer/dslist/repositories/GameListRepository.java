package com.devrogerfer.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devrogerfer.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
