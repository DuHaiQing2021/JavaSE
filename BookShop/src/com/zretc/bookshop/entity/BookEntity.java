package com.zretc.bookshop.entity;

public class BookEntity {
	//���
	private int bookId;
	//����
	private String name;
	//����
	private String author;
	//�۸�
	private double price;
	
	public BookEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookEntity(int bookId, String name, String author, double price) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [��ţ�" + bookId + ", ������" + name + ", ���ߣ�" + author + ", �۸�" + price + "]";
	}
	
}