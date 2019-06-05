package co.booksapi.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Volume {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String title;

	@Column(columnDefinition = "TEXT(1000)")
	private String description;
	private String publisher;
	private String publishedDate;
	private String previewLink;
	private String author1;
	private String author2;
	private String category1;
	private String category2;

	public Long getId() {
		return id;
	}

	public String getAuthor1() {
		return author1;
	}

	public String getAuthor2() {
		return author2;
	}

	public String getCategory1() {
		return category1;
	}

	public String getCategory2() {
		return category2;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAuthor1(String author1) {
		this.author1 = author1;
	}

	public void setAuthor2(String author2) {
		this.author2 = author2;
	}

	public void setCategory1(String category1) {
		this.category1 = category1;
	}

	public void setCategory2(String category2) {
		this.category2 = category2;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
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

	public void setDescription(String description) {
		this.description = description;
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

}
