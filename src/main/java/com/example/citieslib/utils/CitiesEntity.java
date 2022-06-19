package com.example.citieslib.utils;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cities", schema = "public", catalog = "cities")
public class CitiesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "people")
    private Integer people;
    @Basic
    @Column(name = "locationx")
    private Integer locationx;
    @Basic
    @Column(name = "locationy")
    private Integer locationy;
    @Basic
    @Column(name = "history")
    private String history;

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

    public Integer getPeople() {
        return people;
    }

    public void setPeople(Integer people) {
        this.people = people;
    }

    public Integer getLocationx() {
        return locationx;
    }

    public void setLocationx(Integer locationx) {
        this.locationx = locationx;
    }

    public Integer getLocationy() {
        return locationy;
    }

    public void setLocationy(Integer locationy) {
        this.locationy = locationy;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CitiesEntity that = (CitiesEntity) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(people, that.people) && Objects.equals(locationx, that.locationx) && Objects.equals(locationy, that.locationy) && Objects.equals(history, that.history);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, people, locationx, locationy, history);
    }
}
