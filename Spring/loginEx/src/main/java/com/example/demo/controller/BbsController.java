package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.service.BbsService;
import com.example.demo.model.dto.BbsDto;

@Controller
public class BbsController {

	@Autowired
	BbsService bbsService;

	@RequestMapping(value = "bbslistcontroller", method = RequestMethod.GET)
	public String gobbslist(Model model, HttpServletRequest request) {

		List<BbsDto> bbsList = bbsService.allBbsList();
		System.out.println(bbsList);
		System.out.println(request.getSession().getAttribute("login"));
		model.addAttribute("bbsList", bbsList);
		return "bbslist";
	}

	@RequestMapping(value = "BbsWritecontroller", method = RequestMethod.GET)
	public String gobbswrite(HttpServletRequest request) {
		System.out.println(request.getSession().getAttribute("login"));

		return "bbswrite";
	}

	@ResponseBody
	@RequestMapping(value = "addbbscontroller", method = RequestMethod.GET)
	public boolean addbbs(BbsDto bbsdto) {

		boolean isS = bbsService.addbbs(bbsdto);

		return isS;
	}

	@RequestMapping(value = "gobbsdetail", method = RequestMethod.GET)
	public String gobbsdetail(int seq, Model model) {

		BbsDto dto = bbsService.getbbs(seq);
		System.out.println(dto);
		model.addAttribute("getbbs", dto);

		return "bbsDetail";
	}

	@ResponseBody
	@RequestMapping(value = "addreply.do", method = RequestMethod.GET)
	public boolean addreply(BbsDto bbs) {

		bbsService.updatestep(bbs);
		boolean isS = bbsService.addreply(bbs);

		return isS;
	}

}
