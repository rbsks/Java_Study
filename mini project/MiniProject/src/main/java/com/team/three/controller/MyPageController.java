package com.team.three.controller;

import com.team.three.dao.service.CommentService;
import com.team.three.dao.service.PostService;
import com.team.three.model.dto.Member;

public class MyPageController {
	private PostService postService;
	private CommentService commentservice;
	
	public String searchPostByMember(Member member) {
		postService.callSearchPostByMember(member);
		return null;
	}
	
	public String searchCommentByMember(Member member) {
		commentservice.callSearchCommentByMember(member);
		return null;
	}
}
