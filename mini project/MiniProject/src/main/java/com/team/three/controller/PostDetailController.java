package com.team.three.controller;

import com.team.three.dao.service.LikeService;
import com.team.three.dao.service.PostService;
import com.team.three.model.dto.Post;

public class PostDetailController {
	private PostService postService;
	private LikeService likeService;
	
	public void searchPostById(Post post) {
		postService.callSearchPostByPost(post);
		likeService.callSearchLikeAll();
	}
}
