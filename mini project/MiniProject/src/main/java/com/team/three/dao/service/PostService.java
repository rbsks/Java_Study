package com.team.three.dao.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.team.three.model.dto.Member;
import com.team.three.model.dto.Post;

public interface PostService {
	void callCreatePost(Post post);
	List<Post> callSearchPostAll();
	List<Post> callSearchPostByMember(Member member);
	Post callSearchPostByPost(Post post);
	void callUpdatePost();
	void callDeletePost();
	void callanswerUpdate(int post_No);
	void callanswerInsert(Post post);
}
