package org.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book() {
    }
}
