package com.blog.myapp.board.service;

import java.util.List;

import javax.inject.Inject;

import com.blog.myapp.board.dao.BoardDAO;
import com.blog.myapp.board.model.BoardVO;

public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDAO dao;

	public List<BoardVO> getBoardList() throws Exception {
		// TODO Auto-generated method stub
		return dao.getBoardList();
	}

}
