package com.javaex.ex04;

import java.util.List;

//메인
public class AuthorApp {

	public static void main(String[] args) {
		
		AuthorDAO authorDAO = new AuthorDAO();
		
		//int c01 = authorDAO.authorInsert("송지효","런닝맨");
		
		int c02 = authorDAO.authorUpdate(2,"양세찬","런닝맨");
		
		//int c03 = authorDAO.authorDelete(2);
		
		//List<AuthorVO> authorList = authorDAO.authorSelect();
	}

}
