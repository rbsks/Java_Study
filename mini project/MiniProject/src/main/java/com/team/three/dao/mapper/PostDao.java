package com.team.three.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.team.three.model.dto.Member;
import com.team.three.model.dto.Post;

public interface PostDao {
	void createPost(Post post);
	List<Post> searchPostAll();
	List<Post> searchPostByMember(Member member);
	Post searchPostByPost(Post post);
	void updatePost();
	void deletePost();
	void answerUpdate(int post_No);
	void answerInsert(Post post);
}
