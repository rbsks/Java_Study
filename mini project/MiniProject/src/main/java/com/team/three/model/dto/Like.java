package com.team.three.model.dto;

public class Like extends Post {
	private int likeCount;
	
	public Like() {
	}

	@Override
	public String toString() {
		return "Like [likeCount=" + likeCount + ", toString()=" + super.toString() + "]";
	}

	
}
