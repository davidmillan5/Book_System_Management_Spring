package com.book.systemmanagementwithmongodb.model;

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
@Document(collection="loaned")
public class Loaned {

    @Id
    private String id;

    private int loaned_units;

    private Date loaned_date;

    private Date loaned_due_date;



}
