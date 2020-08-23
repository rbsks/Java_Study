package com.team.three.dao.service;

import java.util.List;

import com.team.three.model.dto.Like;

public interface LikeService {
	void callCreateLike();
	List<Like> callSearchLikeAll();
	void callDeleteLike();
}
