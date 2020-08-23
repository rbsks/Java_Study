package com.team.three.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.team.three.dao.service.LikeService;
import com.team.three.dao.service.PostService;
import com.team.three.model.dto.Post;

@Controller
public class PostMainController {
	
	@Autowired
	private PostService postService;
	
	@Autowired
	private LikeService likeService;
	
	@GetMapping("Write")
	public String home() {
		return "Write";
		
	}
	
	@RequestMapping(value="postlist", method = RequestMethod.GET)
	public String searchPostAll(Model model) {
		List<Post> post = postService.callSearchPostAll();
		System.out.println(post);
		model.addAttribute("postAll", post);
		return "post";
	}
	
	
	@GetMapping("post")
	public String callanswer(Model model, @Param("post")Post post, HttpServletRequest request) {
//		int post_No = Integer.parseInt(request.getParameter("post_No"));
//		String title = request.getParameter("title");
//		String contents = request.getParameter("contents");
//		String nickName = request.getParameter("nickName");
		post.setNickName("인스타"); 
		post.setCategory("공지사항");
		post.setTitle("test");
		post.setContents("인스타");
		post.setPost_No(30);
		postService.callanswerUpdate(post.getPost_No());
		postService.callanswerInsert(post);
		List<Post> postlist = postService.callSearchPostAll();
		model.addAttribute("postAll", postlist);
		return "post";
	}
	
	
	
}
