package com.zretc.bookshop.entity;

public class AllBook {
	//����
	private String bookName;
	//��ı��
	private String bookId;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public AllBook(String bookName, String bookId) {
		super();
		this.bookName = bookName;
		this.bookId = bookId;
	}
	
}
