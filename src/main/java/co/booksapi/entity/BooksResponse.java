package co.booksapi.entity;

import java.util.List;

public class BooksResponse {

	List<Items> items;

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "BooksResponse [items=" + items + "]";
	}

}
