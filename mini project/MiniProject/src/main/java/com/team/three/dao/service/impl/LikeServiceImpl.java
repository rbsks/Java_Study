package com.team.three.dao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.three.dao.mapper.LikeDao;
import com.team.three.dao.service.LikeService;
import com.team.three.model.dto.Like;

@Service("likeService")
public class LikeServiceImpl implements LikeService {
	
	@Autowired
	private LikeDao likeDao;
	
	@Override
	public void callCreateLike() {
		likeDao.createLike();
	}

	@Override
	public List<Like> callSearchLikeAll() {
		likeDao.searchLikeAll();
		return null;
	}

	@Override
	public void callDeleteLike() {
		likeDao.deleteLike();
	}

}
