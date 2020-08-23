package com.team.three.dao.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.three.dao.mapper.PostDao;
import com.team.three.dao.service.PostService;
import com.team.three.model.dto.Member;
import com.team.three.model.dto.Post;

@Service("postService")
public class PostServiceImpl implements PostService {
	
	@Autowired
	PostDao postDao;
	
	@Override
	public void callCreatePost(Post post) {
		System.out.println("callCreatePost(Post post)");
		postDao.createPost(post);
	}

	@Override
	public List<Post> callSearchPostByMember(Member member) {
		postDao.searchPostByMember(member);
		return null;
	}
	
	@Override
	public List<Post> callSearchPostAll() {
		System.out.println("List<Post> callSearchPostAll()");
		return postDao.searchPostAll();
	}
	
	@Override
	public Post callSearchPostByPost(Post post) {
		postDao.searchPostByPost(post);
		return null;
	}

	@Override
	public void callUpdatePost() {
		postDao.updatePost();
	}

	@Override
	public void callDeletePost() {
		postDao.deletePost();
	}

	@Override
	public void callanswerUpdate(int post_No) {
		System.out.println("callanswerUpdate(Post post)");
		postDao.answerUpdate(post_No);
	}

	@Override
	public void callanswerInsert(Post post) {
		System.out.println("callanswerInsert(Post post)");
		postDao.answerInsert(post);
	}

}
