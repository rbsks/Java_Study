package com.team.three.dao.service.impl;

import java.util.List;

import com.team.three.dao.mapper.CommentDao;
import com.team.three.dao.service.CommentService;
import com.team.three.model.dto.Comment;
import com.team.three.model.dto.Member;
import com.team.three.model.dto.Post;

public class CommentServiceImpl implements CommentService {
	private CommentDao commentDao;
	
	@Override
	public void callCreateComment() {
		commentDao.createComment();
	}

	@Override
	public List<Comment> callSearchCommentAll() {
		commentDao.searchCommentAll();
		return null;
	}

	@Override
	public List<Comment> callSearchCommentByMember(Member member) {
		commentDao.SearchCommentById(member);
		return null;
	}
	
	@Override
	public void callUpdateComment() {
		commentDao.updateComment();
	}

	@Override
	public void callDeleteComment() {
		commentDao.deleteComment();
	}

}
