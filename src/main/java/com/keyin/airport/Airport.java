package com.keyin.airport;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Airport {
    @Id
    @SequenceGenerator(name = "airport_sequence", sequenceName = "airport_sequence",allocationSize = 1, initialValue = 2)
    @GeneratedValue(generator = "airport_sequence")
    private long id;
    private String name;
    private String code;

    public Airport() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}