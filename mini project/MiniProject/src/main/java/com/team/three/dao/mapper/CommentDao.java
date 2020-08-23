package com.team.three.dao.mapper;

import java.util.List;

import com.team.three.model.dto.Member;
import com.team.three.model.dto.Post;

public interface CommentDao {
	void createComment();
	List<Post> searchCommentAll();
	List<Post> SearchCommentById(Member member);
	void updateComment();
	void deleteComment();
}
