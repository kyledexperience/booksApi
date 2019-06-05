package co.booksapi.entity;

import java.util.List;

public class VolumeInfo {

	private String title;
	private List<String> authors;
	private List<String> categories;
	private String description;
	private String publisher;
	private String publishedDate;
	private String previewLink;
	private ImageLinks imageLinks;

	public ImageLinks getImageLinks() {
		return imageLinks;
	}

	public void setImageLinks(ImageLinks imageLinks) {
		this.imageLinks = imageLinks;
	}

	public String getTitle() {
		return title;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public String getDescription() {
		return description;
	}

	public List<String> getCategories() {
		return categories;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getPublishedDate() {
		return publishedDate;
	}

	public String getPreviewLink() {
		return previewLink;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}

	public void setPreviewLink(String previewLink) {
		this.previewLink = previewLink;
	}

	public VolumeInfo() {
		super();
	}

}
