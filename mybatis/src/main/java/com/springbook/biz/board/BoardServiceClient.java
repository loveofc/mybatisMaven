package com.springbook.biz.board;

import java.util.List;

import com.springbook.biz.board.impl.BoardDAO;

public class BoardServiceClient {
	public static void main(String[] args) {
		BoardVo vo = new BoardVo();
		BoardDAO dao = new BoardDAO();
		
		vo.setTitle("mybatis 제목");
		vo.setWriter("마이바티스");
		vo.setContent("마이바티스 내용입니다......");
		dao.insertBoard(vo);
		
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		List<BoardVo> lists = dao.getBoardList(vo);
		for(BoardVo v : lists) {
			System.out.println("-----> "+v.toString());
		}
	}
}
