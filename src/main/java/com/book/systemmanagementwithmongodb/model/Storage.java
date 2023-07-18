package com.book.systemmanagementwithmongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="storage")
public class Storage {

    @Id
    private String id;
    private Integer total_units;
    private Integer available_units;
    private Integer loaned_units;
    private Book book;
}
