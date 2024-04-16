package com.demo.springcrud.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Subject")
public class Subject {

    @Id
    private String Id;
    private String Name;
    private int cost;

    public Subject() {
    }

    public Subject(String id, String name, int cost) {
        Id = id;
        Name = name;
        this.cost = cost;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
