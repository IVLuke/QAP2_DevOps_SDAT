package com.keyin.airport;

import com.keyin.aircraft.Aircraft;
import com.keyin.city.City;

import javax.persistence.*;
import java.util.List;

@Entity
public class Airport {
    @Id
    @SequenceGenerator(name = "airport_sequence", sequenceName = "airport_sequence",allocationSize = 1, initialValue = 2)
    @GeneratedValue(generator = "airport_sequence")
    private long id;
    private String name;
    private String code;
    @OneToOne
    private City city;
    @ManyToMany
    private List<Aircraft> aircrafts;

    public Airport() {
    }

    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public void setAircrafts(List<Aircraft> aircrafts) {
        this.aircrafts = aircrafts;
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
