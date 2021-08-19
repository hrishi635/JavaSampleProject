package BookStore.Repository;
import java.util.List;
import java.util.ArrayList;
import BookStore.model.Store;

public class StoreRepository {
	
	private List<Store> listOfStores;
	
	public StoreRepository()
	{
		listOfStores=new ArrayList<>();
	}

	public List<Store> getListOfStores() {
		return listOfStores;
	}

	public void setListOfStores(List<Store> listOfStores) {
		this.listOfStores = listOfStores;
	}
	
	public Store getStore(Store findStore)
	{
		for(Store store:listOfStores)
		{
			if(store.getAddress().equals(findStore.getAddress()))
				return store;
		}
		return null;
	}
	
	public void addStore(Store store)
	{
		listOfStores.add(store);
	}
	
	public void updateStore(Store updateStore)
	{
		List<Store> listOfStores1=new ArrayList<>();
		for(Store store:listOfStores)
		{
			if(store.getOwner().equals(updateStore.getOwner()))
				store.setListOfBooks(updateStore.getListOfBooks());
			listOfStores1.add(store);
		}
		
		listOfStores=listOfStores1;
		
		
	}
	
}
