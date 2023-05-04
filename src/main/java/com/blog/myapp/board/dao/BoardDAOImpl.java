package com.blog.myapp.board.dao;

import java.text.Bidi;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.blog.myapp.board.model.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sqlSession;
	
	@Override
	public List<BoardVO> getBoardList() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("com.blog.myapp.board.boardMapper.getBoardList");
	}

	@Override
	public BoardVO getBoardList(int bid) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("com.blog.myapp.board.boardMapper.getBoardContents");
	}

	@Override
	public int insertBoard(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert("com.blog.myapp.board.boardMapper.insertBoard", boardVO);
	}

	@Override
	public int updateBoard(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.update("com.blog.myapp.board.boardMapper.deleteBoard", boardVO);
	}

	@Override
	public int deleteBoard(int bid) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert("com.blog.myapp.board.boardMapper.deleteBoard", bid);
	}

	@Override
	public int updateViewCnt(int bid) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.update("com.blog.myapp.board.boardMapper.updateViewCnt", bid);
	}

}
