package BookStore.model;
import java.util.List;

public class Store {
	
	private String storeName;
	private String pincode;
	private String address;
	private String owner;
	private List<Book> ListOfBooks;
	
	
	public Store(String storeName,String pincode,String address,String owner,List<Book> ListOfBooks)
	{
		this.storeName=storeName;
		this.pincode=pincode;
		this.address=address;
		this.owner=owner;
		this.ListOfBooks=ListOfBooks;
	}
	
	public String getStoreName() {
		return storeName;
	}
	
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	@Override
	public String toString()
	{
		return "Store =[Name: "+storeName+" Pincode: "+pincode+" Address: "+address+" Owner: "+owner+" ]";
	}

	public List<Book> getListOfBooks() {
		return ListOfBooks;
	}

	public void setListOfBooks(List<Book> listOfBooks) {
		ListOfBooks = listOfBooks;
	}
}
