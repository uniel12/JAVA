package model;

public class BookDTO {

	// 테이블 명 :  book
	// 컬럼 
	// 1. 도서이름 : String -title : varchar2(50)
	// 2. 저자 : String - name : varchar2(50)
	// 3. 가격 : int - price : number
	// 4. 도서번호 : String = booknum : varchar2(50)
	// 콩쥐팥쥐 전래동화 5000 E-200
	
	private String title;
	private String name;
	private int price;
	private String booknum;
	

	public BookDTO(String title, String name, int price, String booknum) {
		// 현재 필드를 초기화
		this.title = title;
		this.name = name;
		this.price = price;
		this.booknum = booknum;
	}
	


	// getter / setter 메소드
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getBooknum() {
		return booknum;
	}


	public void setBooknum(String booknum) {
		this.booknum = booknum;
	}


	
	
}
