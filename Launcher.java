package BookStore.driver;
import java.util.List;
import java.util.ArrayList;

import BookStore.Repository.BookRepository;
import BookStore.Repository.StoreRepository;
import BookStore.Services.BookService;
import BookStore.model.Book;
import BookStore.model.Store;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book1=new Book("JK Rowling","HP-1",120,450,"thriller");
		Book book2=new Book("Uncle Bob","Design Patterns",300,550,"CSE");
		Store store=new Store("Thackers Book Store","721301","Tech Market","abc",new ArrayList<>());
		BookRepository bookRepo=new BookRepository();
		BookService bookService=new BookService();
		StoreRepository storeRepo=new StoreRepository();
		
		bookService.createBook(book1, bookRepo, store, storeRepo);
		bookService.createBook(book2, bookRepo, store, storeRepo);
		System.out.println(storeRepo.getListOfStores());
		System.out.println(bookRepo.getListOfBooks());
		bookService.removeBook(book1,bookRepo,store,storeRepo);
		System.out.println(bookRepo.getListOfBooks());
		
	}

}
