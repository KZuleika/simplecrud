package com.kzcp.simplecrud.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String authorName;

    private String authorLastname;


    @Temporal(TemporalType.DATE)
    private Date publicationDate;

    private String editorial;

    @Column(unique = true)
    private Long isbn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorLastname() {
        return authorLastname;
    }

    public void setAuthorLastname(String authorLastname) {
        this.authorLastname = authorLastname;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(final Object obj) {
        if(obj == null){ return false; }
        if(obj == this){ return true; }
        if(obj.getClass() != getClass()){ return false; }

        return super.equals(obj);
    }

    @Override
    public String toString() {
        String objStr = "Id = %d, Nombre = %s, Autor = %s %s, Fecha de publicación = %s, Editorial = %s, ISBN = %s";
        return String.format(objStr,this.id, this.name, this.authorName, this.authorLastname, this.publicationDate, this.isbn);
    }
}
