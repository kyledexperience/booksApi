package co.booksapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.booksapi.entity.BooksResponse;
import co.booksapi.entity.Items;

@Component
public class BooksService {

	private RestTemplate restTemplate = new RestTemplate();

	@Value("${api_key}")
	private String api_key;

	public List<Items> items(String query) {

		String url = "https://www.googleapis.com/books/v1/volumes?q=" + query + "&key=" + api_key;

		BooksResponse response = restTemplate.getForObject(url, BooksResponse.class);

		return response.getItems();

	}
}
