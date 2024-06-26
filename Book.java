package model;

import repositoris.*;

public class Book {

    private String book_id;
    private String title;
    private String pub;
    private String pub_id;
    private String au;
    private String au_id;
    private String notes;
    private String userName;

    public Book() {
    }

    public Book(String book_id, String title, String pub, String pub_id, String au, String au_id, String notes, String userName) {
        this.book_id = book_id;
        this.title = title;
        this.pub = pub;
        this.pub_id = pub_id;
        this.au = au;
        this.au_id = au_id;
        this.notes = notes;
        this.userName = userName;
    }

    public Book(String book_id, String title, String pub, String au, String notes) {
        this.book_id = book_id;
        this.title = title;
        this.pub = pub;
        this.au = au;
        this.notes = notes;
    }

    public String getBook_id() {
        return book_id;
    }

    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

    public String getPub_id() {
        return pub_id;
    }

    public void setPub_id(String pub_id) {
        this.pub_id = pub_id;
    }

    public String getAu() {
        return au;
    }

    public void setAu(String au) {
        this.au = au;
    }

    public String getAu_id() {
        return au_id;
    }

    public void setAu_id(String au_id) {
        this.au_id = au_id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    
}
