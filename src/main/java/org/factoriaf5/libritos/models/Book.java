package org.factoriaf5.libritos.models;

import javax.persistence.*;
import javax.sound.midi.Sequence;
import java.io.Serializable;

@Entity
@Table(name = "books" )
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String title;
    private String author;
    private String category;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
    public  String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author ;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }
}
