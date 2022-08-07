package library.mini.project;

import java.sql.Date;

public class BookVO {
	private int bookNo;
	private String title;
	private String author;
	private int price;
	private Date inDate;
	
	public BookVO(int bookNo, String title, String author, int price, Date inDate){
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.price = price;
		this.inDate = inDate;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getInDate() {
		return inDate;
	}

	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}	
}