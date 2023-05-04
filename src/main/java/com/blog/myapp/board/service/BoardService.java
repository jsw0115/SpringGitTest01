package com.blog.myapp.board.service;

import java.util.List;

import com.blog.myapp.board.model.BoardVO;

public interface BoardService {
	public List<BoardVO> getBoardList() throws Exception;
}
