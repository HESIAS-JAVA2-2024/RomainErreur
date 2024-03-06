package org.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "library")
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "id", nullable = false)
    private int id;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "address", nullable = false)
    private String address;
    
    public Library() {
    }
    
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
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
}
