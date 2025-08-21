package com.devrogerfer.dslist.projections;

public interface GameMinProjection {

	// GETs methods corresponding to queries
	Long getId();
	String getTitle();
	Integer getGameYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
}
