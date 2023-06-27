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
@Document(collection="returned")
public class Returned {

    @Id
    private String id;

    private String user_name;
    private String user_lastname;
    private String user_email;
    private String bookIsbn;
    private String bookTitle;
    private int returned_units;

    private Date returned_date;


    // Getters and Setters


    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_lastname() {
        return user_lastname;
    }

    public void setUser_lastname(String user_lastname) {
        this.user_lastname = user_lastname;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getReturned_units() {
        return returned_units;
    }

    public void setReturned_units(int returned_units) {
        this.returned_units = returned_units;
    }

    public Date getReturned_date() {
        return returned_date;
    }

    public void setReturned_date(Date returned_date) {
        this.returned_date = returned_date;
    }

    // Constructors


    public Returned() {
    }

    public Returned(String user_name, String user_lastname, String user_email, String bookIsbn, String bookTitle, int returned_units, Date returned_date) {
        this.user_name = user_name;
        this.user_lastname = user_lastname;
        this.user_email = user_email;
        this.bookIsbn = bookIsbn;
        this.bookTitle = bookTitle;
        this.returned_units = returned_units;
        this.returned_date = returned_date;
    }

    // equals and Hashcode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Returned returned = (Returned) o;

        return Objects.equals(id, returned.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    // toString


    @Override
    public String toString() {
        return "Returned{" +
                "id='" + id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_lastname='" + user_lastname + '\'' +
                ", user_email='" + user_email + '\'' +
                ", bookIsbn='" + bookIsbn + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", returned_units=" + returned_units +
                ", returned_date=" + returned_date +
                '}';
    }
}
