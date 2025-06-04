package com.javaex.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookUpdate {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			// 1. JDBC 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Connection 얻어오기
			String url = "jdbc:mysql://localhost:3306/web_db";
			conn = DriverManager.getConnection(url, "web", "web");

			// 3. SQL문 준비 / 바인딩 / 실행
			String query = "";
			query += "update book ";
			query += "set book_id = ?, ";
			query += "title = ?, ";
			query += "pubs = ?, ";
			query += "pub_date = ?, ";
			query += "author_id = ? ";
			query += "where book_id = ?"; 

			System.out.println(query);

			// 바인딩
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, 4);  
			pstmt.setString(2, "토지");
			pstmt.setString(3, "마로니예북스");
			pstmt.setString(4, "2012-08-15");
			pstmt.setInt(5, 3);
			pstmt.setInt(6, 3);

			// 실행
			int count = pstmt.executeUpdate();

			// 결과처리
			System.out.println(count + "건이 수정 되었습니다");

		} catch (ClassNotFoundException e) {
			System.out.println("error: 드라이버 로딩 실패 - " + e);
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println("error:" + e);
			}
		}
	}
}
