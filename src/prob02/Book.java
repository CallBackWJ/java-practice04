package prob02;

public class Book {

	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	public Book(int bookNo, String title, String author) {
		// TODO Auto-generated constructor stub
		this.bookNo=bookNo;
		this.title=title;
		this.author=author;
		this.stateCode=1;
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


	public int getStateCode() {
		return stateCode;
	}


	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}


	public void rent() {
		// TODO Auto-generated method stub
		if(stateCode!=0)
		{
			stateCode=0;
			System.out.println(title+"이(가) 대여 됐습니다.");
		}else
		{
			System.out.println("이미 대여된 도서입니다.");
		}
	}
	
	public void print()
	{
		
		String check=stateCode==0?"대여중":"재고있음";
		System.out.println("책 제목:"+title+", 작가:"+author+", 대여 유무:"+check);
	}
}