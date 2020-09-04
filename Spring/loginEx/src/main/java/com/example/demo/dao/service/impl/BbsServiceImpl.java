package com.example.demo.dao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.mapper.BbsDao;
import com.example.demo.dao.service.BbsService;
import com.example.demo.model.dto.BbsDto;

@Service("bbsService")
public class BbsServiceImpl implements BbsService {

	@Autowired
	BbsDao bbsDao;
	
	@Override
	public List<BbsDto> allBbsList() {
		System.out.println("allBbsList");
		return bbsDao.allBbsList();
	}

	@Override
	public boolean addbbs(BbsDto bbsDto) {
		System.out.println("addbbs");
		return bbsDao.addbbs(bbsDto);
	}

	@Override
	public BbsDto getbbs(int seq) {
		System.out.println("getbbs");
		return bbsDao.getbbs(seq);
	}

	@Override
	public boolean addreply(BbsDto bbsDto) {
		System.out.println("addreply");
		return bbsDao.addreply(bbsDto);
	}

	@Override
	public boolean updatestep(BbsDto bbsdto) {
		System.out.println("updatestep");
		return bbsDao.updatestep(bbsdto);
	}

}
