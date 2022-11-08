package com.proj.springboot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue
    private Long Id;
    private String Name;
    private String Email;

    public Long getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return  Email;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setEmail(String email) {
        this.Email = email;
    }
}
