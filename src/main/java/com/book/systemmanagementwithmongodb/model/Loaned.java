package com.book.systemmanagementwithmongodb.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE, force=true)
@Document(collection="loaned")
public class Loaned {

    @Id
    private String id;
    private Integer loaned_units;
    private LocalDateTime loaned_date = LocalDateTime.now();
    private LocalDateTime loaned_due_date = LocalDateTime.now().plusDays(10);
    private Book book;
    private User user;


    public Loaned(Integer loaned_units, Book book, User user) {
        this.loaned_units = loaned_units;
        this.book = book;
        this.user = user;
    }
}
