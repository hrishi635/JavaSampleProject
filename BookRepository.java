package BookStore.Repository;
import java.util.List;
import java.util.ArrayList;

import BookStore.model.Book;

public class BookRepository {
	
	private List<Book> listOfBooks;
	
	public BookRepository()
	{
		listOfBooks=new ArrayList<>();
	}

	public List<Book> getListOfBooks() {
		return listOfBooks;
	}

	public void setListOfBooks(List<Book> listOfBooks) {
		this.listOfBooks = listOfBooks;
	}
	
	public Book getBook(Book findbook)
	{
		for(Book book:listOfBooks)
		{
			if(book.getTitle().equals(findbook.getTitle()))
				return book;
		}
		return null;
	}
	
	public void addBook(Book book)
	{
		listOfBooks.add(book);
	}
	
	public List<Book> removeBook(Book bookToRemove)
	{
		List<Book> updatedListOfBooks = new ArrayList<>();
		for(Book book:listOfBooks)
		{
			if(book.getTitle().equals(bookToRemove.getTitle()) && book.getAuthor().equals(bookToRemove.getAuthor()))
				continue;
			updatedListOfBooks.add(book);
		}
		setListOfBooks(updatedListOfBooks);
		return updatedListOfBooks;
	}
	

}
