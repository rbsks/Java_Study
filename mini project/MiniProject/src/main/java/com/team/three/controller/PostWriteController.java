package com.team.three.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.team.three.dao.service.PostService;
import com.team.three.model.dto.Member;
import com.team.three.model.dto.Post;

@Controller
public class PostWriteController {
	
	@Autowired
	private PostService postService;
	
	@GetMapping("createPost")
	public String cc(Model model, Post post, HttpServletRequest request) {
		post.setNickName("삼성"); 
		post.setCategory("공지사항");
		post.setTitle(request.getParameter("title"));
		post.setContents(request.getParameter("contents"));
		postService.callCreatePost(post);
		List<Post> postlist = postService.callSearchPostAll();
		model.addAttribute("postAll", postlist);
		return "post";
	}
}
