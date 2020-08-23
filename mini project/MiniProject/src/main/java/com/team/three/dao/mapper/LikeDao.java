package com.team.three.dao.mapper;

import java.util.List;

import com.team.three.model.dto.Like;

public interface LikeDao {
	void createLike();
	List<Like> searchLikeAll();
	void deleteLike();
}
