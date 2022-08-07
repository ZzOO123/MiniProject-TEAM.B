package library.mini.project;

import java.sql.Date;

public class ListVO {
	private int libNo;
	private int stdNo;
	private int bookNo;
	private Date dateOut;
	private Date dateIn;
	private Date dateCheck;
	
	public ListVO(int libNo, int stdNo, int bookNo, Date dateOut, Date dateIn, Date dateCheck){
		this.libNo = libNo;
		this.stdNo = stdNo;
		this.bookNo = bookNo;
		this.dateOut = dateOut;
		this.dateIn = dateIn;
		this.dateCheck = dateCheck;
	}

	public int getLibNo() {
		return libNo;
	}

	public void setLibNo(int libNo) {
		this.libNo = libNo;
	}

	public int getStdNo() {
		return stdNo;
	}

	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public Date getDateOut() {
		return dateOut;
	}

	public void setDateOut(Date dateOut) {
		this.dateOut = dateOut;
	}

	public Date getDateIn() {
		return dateIn;
	}

	public void setDateIn(Date dateIn) {
		this.dateIn = dateIn;
	}

	public Date getDateCheck() {
		return dateCheck;
	}

	public void setDateCheck(Date dateCheck) {
		this.dateCheck = dateCheck;
	}
	
	
}
