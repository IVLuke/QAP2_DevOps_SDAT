package com.keyin.city;

import com.keyin.airport.Airport;
import com.keyin.passenger.Passenger;

import javax.persistence.*;
import java.util.List;

@Entity
public class City {
    @Id
    @SequenceGenerator(name = "city_sequence", sequenceName = "city_sequence",allocationSize = 1, initialValue = 2)
    @GeneratedValue(generator = "city_sequence")

    private long id;
    private String name;
    private String state;
    private int population;
    @OneToMany
    private List<Airport> airports;


    public City() {
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List<Airport> getAirports() {
        return airports;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }
}
