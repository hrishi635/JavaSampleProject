package BookStore.Services;
import BookStore.model.Book;
import BookStore.model.Store;
import BookStore.Repository.BookRepository;
import BookStore.Repository.StoreRepository;
import java.util.List;


public class BookService {
	
	public void createBook(Book newbook,BookRepository bookRepository,Store findstore,StoreRepository storeRepository)
	{
		bookRepository.addBook(newbook);
		for(Store store : storeRepository.getListOfStores())
		{
			if(store.getAddress().equals(findstore.getAddress()))
			{
				List<Book> listOfbooks = store.getListOfBooks();
				for(Book book: listOfbooks)
				{
					if(book.getTitle().equals(newbook.getTitle()) && book.getAuthor().equals(newbook.getAuthor()))
					{
						System.out.println("Book already present in store:"+findstore.getStoreName());
						return;
					}
				}
				
				listOfbooks = store.getListOfBooks();
				listOfbooks.add(newbook);
				store.setListOfBooks(listOfbooks);
				System.out.println("Book created Successfully in store:"+findstore.getStoreName());
				return;
			}
		}
		List<Store> ListOfStores = storeRepository.getListOfStores();
		ListOfStores.add(findstore);
		storeRepository.setListOfStores(ListOfStores);
		List<Book> listOfbooks = findstore.getListOfBooks();
		listOfbooks.add(newbook);
		findstore.setListOfBooks(listOfbooks);
		
		System.out.println("Store:"+findstore.getStoreName()+" and Book:"+newbook.getTitle()+" created Successfully");
	}

	public void removeBook(Book book,BookRepository bookRepository,Store findstore,StoreRepository storeRepository)
	{
		for(Store store:storeRepository.getListOfStores())
		{
			if(store.getAddress().equals(findstore.getAddress()) && store.getOwner().equals(findstore.getOwner()))
			{
				List<Book> UpdatedListOfBooks = bookRepository.removeBook(book);
				store.setListOfBooks(UpdatedListOfBooks);
				storeRepository.updateStore(store);
				System.out.println("Book:"+book+" is successfully removed from store:"+findstore);
				return;
			}
		}
		
		System.out.println("Book:"+book+" does not exist in the store:"+findstore);
	}
}
