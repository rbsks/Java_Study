package com.example.demo.dao.mapper;

import java.util.List;

import com.example.demo.model.dto.BbsDto;

public interface BbsDao {
	List<BbsDto> allBbsList();
	boolean addbbs(BbsDto bbsDto);
	BbsDto getbbs(int seq);
	boolean addreply(BbsDto bbsDto);
	boolean updatestep(BbsDto bbsdto);

}
