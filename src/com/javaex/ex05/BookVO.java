package com.javaex.ex05;

public class BookVO {
	//필드
		private int bookid;
		private String title;
		private String pubs;
		private String pubdate;
		private int authorid;
		private String authorname;
		private String authordesc;
		
		
		//생성자
		public BookVO() {
			
		}
		
		
		public BookVO(int bookid, String title, String pubs, String pubdate, int authorid, String authorname,
				String authordesc) {
			super();
			this.bookid = bookid;
			this.title = title;
			this.pubs = pubs;
			this.pubdate = pubdate;
			this.authorid = authorid;
			this.authorname = authorname;
			this.authordesc = authordesc;
		}


		
		
		//메소드gs
		
		public int getBookid() {
			return bookid;
		}


		public void setBookid(int bookid) {
			this.bookid = bookid;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}


		public String getPubs() {
			return pubs;
		}


		public void setPubs(String pubs) {
			this.pubs = pubs;
		}


		public String getPubdate() {
			return pubdate;
		}


		public void setPubdate(String pubdate) {
			this.pubdate = pubdate;
		}


		public int getAuthorid() {
			return authorid;
		}


		public void setAuthorid(int authorid) {
			this.authorid = authorid;
		}


		public String getAuthorname() {
			return authorname;
		}


		public void setAuthorname(String authorname) {
			this.authorname = authorname;
		}


		public String getAuthordesc() {
			return authordesc;
		}


		public void setAuthordesc(String authordesc) {
			this.authordesc = authordesc;
		}


		
		
		//메소드일반
		@Override
		public String toString() {
			return "BookVO [bookid=" + bookid + ", title=" + title + ", pubs=" + pubs + ", pubdate=" + pubdate
					+ ", authorid=" + authorid + ", authorname=" + authorname + ", authordesc=" + authordesc + "]";
		}
	}

