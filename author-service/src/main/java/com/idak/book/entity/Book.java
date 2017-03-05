package com.idak.book.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by akadi on 05/03/2017.
 *
 */
@Entity
public class Book implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String isbn;
    private String title;
    private BigDecimal price;

    @Temporal(TemporalType.DATE)
    private Date releaseDate;

    @ManyToMany
    @JoinTable(name = "book_author",  joinColumns = {
            @JoinColumn(name = "book_id", nullable = false, updatable = false) },
            inverseJoinColumns = { @JoinColumn(name = "author_id", nullable = false, updatable = false) })
    private Set<Author> authors = new HashSet<>(0);

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @JsonIgnore
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @JsonIgnore
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @JsonIgnore
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @JsonIgnore
    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @JsonIgnore
    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}
