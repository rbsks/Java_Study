package com.team.three.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
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
	public String write() {
		return "Write";
		
	}
	
	@GetMapping("Answer")
	public String answer() {
		return "Answer";
		
	}
	
	
	@RequestMapping(value="postlist", method = RequestMethod.GET)
	public String searchPostAll(Model model, HttpServletRequest request) {
		List<Post> post = postService.callSearchPostAll();
		List<Post> postlist = new ArrayList<Post>();
		int getpageNo = 0;
		int pageList = 0;
		int endPageList = 0;
		int j = 0;
		int pageNoview = (int)Math.ceil((double)post.size()/10);
		
		
		if(request.getParameter("page") == null) {
			getpageNo = 1;
		}else {
			getpageNo = Integer.parseInt(request.getParameter("page"));
		}
		
		pageList = 10 * getpageNo;

		
		if(pageList < post.size()) {
			endPageList = pageList;
		}else {
			endPageList = post.size();
		} // 마지막 페이지 사이즈 맞춤
		
		for(int i = pageList - 10; i < endPageList;  i++) {
			 postlist.add(j, post.get(i));
			 j++;
		}
		int startPage = Math.max(1, getpageNo - 4);
		int endPage = Math.min(pageNoview, getpageNo+4);
		model.addAttribute("postAll", postlist);
		model.addAttribute("startPage", startPage);
		model.addAttribute("endtPage", endPage);
		model.addAttribute("pageNo", pageNoview);
		model.addAttribute("getPageNo", getpageNo);
		return "post";
	}
	
	
	@GetMapping("postanswer")
	public String callanswer(Model model, Post post, HttpServletRequest request) {
		int post_No = Integer.parseInt(request.getParameter("post_No"));
		post.setPost_No(post_No);
		Post postAnswer = postService.callSearchPostByPost(post);
		
		post.setNickName("sss"); 
		post.setCategory(postAnswer.getCategory());
		post.setTitle(request.getParameter("title"));
		post.setContents(request.getParameter("contents"));
		post.setPost_No(postAnswer.getPost_No());
		
		postService.callanswerUpdate(post_No);
		postService.callanswerInsert(post);
		System.out.println(post.getPost_No());
		List<Post> postlist = postService.callSearchPostAll();
		model.addAttribute("postAll", postlist);
		return "index";
	}
	
	@GetMapping("postdetail")
	public String searchPostById(Model model, Post post, HttpServletRequest request) {
		int post_No = Integer.parseInt(request.getParameter("post_No"));
		post.setPost_No(post_No);
		Post postDetail = postService.callSearchPostByPost(post);
//		likeService.callSearchLikeAll();
		System.out.println(postDetail);
		model.addAttribute("detail", postDetail);
		
		return "postdetail";
	}
	
	
	
}
