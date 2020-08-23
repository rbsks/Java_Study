package com.team.three.dao.service;

import java.util.List;

import com.team.three.model.dto.Comment;
import com.team.three.model.dto.Member;

public interface CommentService {
	void callCreateComment();
	List<Comment> callSearchCommentAll();
	List<Comment> callSearchCommentByMember(Member memeber);
	void callUpdateComment();
	void callDeleteComment();
}
