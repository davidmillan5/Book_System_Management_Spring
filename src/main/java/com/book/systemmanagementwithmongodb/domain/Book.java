package com.book.systemmanagementwithmongodb.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Objects;


@Data
@AllArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE, force=true)
@Document(collection="books")
public class Book {

    @Id
    private String id;

    private String title;

    private String author;

    private String edition;

    private String isbn;

    private String publisher;

    private int pages;

    private Date published;

    private String category;

    private int total_units;

    private int available_units;

    private int borrow_units;


    // Getters And Setters


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getTotal_units() {
        return total_units;
    }

    public void setTotal_units(int total_units) {
        this.total_units = total_units;
    }

    public int getAvailable_units() {
        return available_units;
    }

    public void setAvailable_units(int available_units) {
        this.available_units = available_units;
    }

    public int getBorrow_units() {
        return borrow_units;
    }

    public void setBorrow_units(int borrow_units) {
        this.borrow_units = borrow_units;
    }


    // Constructors


    public Book() {
    }


    public Book(String title, String author, String edition, String isbn, String publisher, int pages, Date published, String category, int total_units, int available_units, int borrow_units) {
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.isbn = isbn;
        this.publisher = publisher;
        this.pages = pages;
        this.published = published;
        this.category = category;
        this.total_units = total_units;
        this.available_units = available_units;
        this.borrow_units = borrow_units;
    }

    // Hashcode and equals


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    // toString


    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", edition='" + edition + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publisher='" + publisher + '\'' +
                ", pages=" + pages +
                ", published=" + published +
                ", category='" + category + '\'' +
                ", total_units=" + total_units +
                ", available_units=" + available_units +
                ", borrow_units=" + borrow_units +
                '}';
    }
}
