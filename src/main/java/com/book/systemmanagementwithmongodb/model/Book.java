package com.book.systemmanagementwithmongodb.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

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

    @Indexed(unique = true)
    private String isbn;

    private String publisher;

    private Integer pages;

    private Date published;

    private String category;

    public Book(String title, String author, String edition, String isbn, String publisher, int pages, Date published, String category) {
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.isbn = isbn;
        this.publisher = publisher;
        this.pages = pages;
        this.published = published;
        this.category = category;
    }
}
