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
	public String home() {
		return "Write";
		
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
	
	
	@GetMapping("posta")
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
