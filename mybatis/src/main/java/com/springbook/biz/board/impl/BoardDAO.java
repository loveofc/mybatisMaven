package com.springbook.biz.board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.springbook.biz.board.BoardVo;
import com.springbook.biz.utill.SqlSessionFactoryBean;

public class BoardDAO {
	private SqlSession mybatis;
	public BoardDAO() {
		mybatis = SqlSessionFactoryBean.getSqlSessiongInstance();
	}
	
	public void insertBoard(BoardVo vo) {
		mybatis.insert("BoardDAO.insertBoard",vo);
		mybatis.commit();
	}
	
	public void updateBoard(BoardVo vo) {
		mybatis.update("BoardDAO.updateBoard",vo);
		mybatis.commit();
	}
	
	public void deleteBoard(BoardVo vo) {
		mybatis.delete("BoardDAO.deleteBoard",vo);
		mybatis.commit();
	}
	
	public BoardVo getBoard(BoardVo vo) {
		return (BoardVo)mybatis.selectOne("BoardDAO.getBoard",vo);
	}
	
	public List<BoardVo> getBoardList(BoardVo vo) {
		return mybatis.selectList("BoardDAO.getBoardList",vo);
	}
}
