package com.book.systemmanagementwithmongodb.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE, force=true)
@Document(collection="borrowed")
public class Loaned {

    @Id
    private String id;

    private int borrow_units;

    private Date borrow_date;

    private Date borrow_due_date;



}
