package com.bit.hgb;

// 자료형을 새로 만든다 "책" 사물에 대한 추상화
public class Book {
	// 여러개의 "책"을 다룰 것이다.
	private long bid; 
	private String isbn; // 책 식별값의 국제 표준
	private String title; // 제목
	private String auth; // 지은이
	private String pub; // 출판사
	
	public long getBid() {
		return bid;
	}
	public void setBid(long bid) {
		this.bid = bid;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", isbn=" + isbn + ", title=" + title + ", auth=" + auth + ", pub=" + pub + "]";
	}
	
	
}
