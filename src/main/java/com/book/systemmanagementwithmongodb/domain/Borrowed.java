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
@Document(collection="borrowed")
public class Borrowed {

    @Id
    private String id;

    private String user_name;

    private String user_lastname;

    private String user_email;

    private String bookIsbn;

    private String bookTitle;

    private int borrow_units;

    private Date borrow_date;

    private Date borrow_due_date;



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

    public int getBorrow_units() {
        return borrow_units;
    }

    public void setBorrow_units(int borrow_units) {
        this.borrow_units = borrow_units;
    }

    public Date getBorrow_date() {
        return borrow_date;
    }

    public void setBorrow_date(Date borrow_date) {
        this.borrow_date = borrow_date;
    }

    public Date getBorrow_due_date() {
        return borrow_due_date;
    }

    public void setBorrow_due_date(Date borrow_due_date) {
        this.borrow_due_date = borrow_due_date;
    }

    // Constructors


    public Borrowed() {
    }


    public Borrowed(String user_name, String user_lastname, String user_email, String bookIsbn, String bookTitle, int borrow_units, Date borrow_date, Date borrow_due_date) {
        this.user_name = user_name;
        this.user_lastname = user_lastname;
        this.user_email = user_email;
        this.bookIsbn = bookIsbn;
        this.bookTitle = bookTitle;
        this.borrow_units = borrow_units;
        this.borrow_date = borrow_date;
        this.borrow_due_date = borrow_due_date;
    }

    // equals and hascodes


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Borrowed borrowed = (Borrowed) o;

        return Objects.equals(id, borrowed.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }


    // toString


    @Override
    public String toString() {
        return "Borrowed{" +
                "id='" + id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_lastname='" + user_lastname + '\'' +
                ", user_email='" + user_email + '\'' +
                ", bookIsbn='" + bookIsbn + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", borrow_units=" + borrow_units +
                ", borrow_date=" + borrow_date +
                ", borrow_due_date=" + borrow_due_date +
                '}';
    }
}
