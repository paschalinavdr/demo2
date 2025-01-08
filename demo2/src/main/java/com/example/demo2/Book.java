package com.example.demo2;
public class Book {
	
    private String title;
    private Author author;
    private Theme theme;
    private String publisher;
    private String description;
    private String year;
    

    
    // Constructor
    public Book(String title, Author author, Theme theme, String publisher, String description, String year) {
        this.title = title;
        this.author = author;
        this.theme = theme;
        this.publisher = publisher;
        this.description = description;
        this.year = year;
    }

    // Default Constructor
    public Book() {
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    // toString method
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author.getFullName() +
                ", theme=" + theme.getName() +
                ", publisher='" + publisher + '\'' +
                ", description='" + description + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}