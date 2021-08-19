package BookStore.model;


public class Book {
	
	private String author;
	private String title;
	private float price;
	private int pages;
	private String genre;
	
	public Book(String author,String title,float price,int pages,String genre)
	{
		this.author=author;
		this.title=title;
		this.price=price;
		this.pages=pages;
		this.genre=genre;
	}
	
	public void setPrice(float price)
	{
		this.price=price;
	}
	
	public float getPrice()
	{
		return price;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public int getPages()
	{
		return pages;
	}
	
	public String getGenre()
	{
		return genre;
	}
	
	public void setGenre(String genre)
	{
		this.genre=genre;
	}
	
	@Override
	public String toString()
	{
		return "Book = [Title:" +title+ " Author:"+author+" Genre:"+genre+" Pages:"+pages+" Price:"+price+" ]";
		
	}

}
