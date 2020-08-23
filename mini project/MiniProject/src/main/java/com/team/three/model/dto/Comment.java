package com.team.three.model.dto;

public class Comment extends Post {
	private int cmCount;
        
	public Comment() {
	}

	public int getCmCount() {
		return cmCount;
	}

	public void setCmCount(int cmCount) {
		this.cmCount = cmCount;
	}

	@Override
	public String toString() {
		return "Comment [cmCount=" + cmCount + ", toString()=" + super.toString() + "]";
	}



	


}
