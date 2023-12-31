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
@Document(collection="returned")
public class Returned {

    @Id
    private String id;
    private Integer returned_units;
    private LocalDateTime returned_date = LocalDateTime.now();
    private Book book;
    private User user;
}
