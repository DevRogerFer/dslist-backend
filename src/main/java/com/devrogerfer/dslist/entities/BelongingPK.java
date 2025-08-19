package com.devrogerfer.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

// auxiliary class to represent the PK (primary key) of the relationship
@Embeddable	// encapsulating two attributes (game_id and list_id) in just one class
public class BelongingPK {
	// references to the Game and GameList classes
	@ManyToOne	// JPA 'many to one' annotation
	@JoinColumn(name = "game_id")	// foreign key name
	private Game game;
	
	@ManyToOne
	@JoinColumn(name = "list_id")
	private GameList list;
	
	
	// constructors
	public BelongingPK() {
		
	}

	public BelongingPK(Game game, GameList list) {		
		this.game = game;
		this.list = list;
	}

	// Getters and Setters
	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public GameList getList() {
		return list;
	}

	public void setList(GameList list) {
		this.list = list;
	}

	// hashCode and equals methods for comparison
	@Override
	public int hashCode() {
		return Objects.hash(game, list);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(game, other.game) && Objects.equals(list, other.list);
	}
	
	
	
}
