package com.devrogerfer.dslist.projections;

public interface GameMinProjection {

	// GETs methods corresponding to queries
	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
}
