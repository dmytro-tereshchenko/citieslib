package com.example.citieslib.models;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "cities", schema = "public", catalog = "cities")
public class City {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    public int id;
    @Basic
    @Column(name = "name")
    public String name;
    @Basic
    @Column(name = "people")
    public int people;
    @Basic
    @Column(name = "locationx")
    public int locationx;
    @Basic
    @Column(name = "locationy")
    public int locationy;
    @Basic
    @Column(name = "history")
    public String history;

    public City() {
    }

    public City(String name, int people, int locationx, int locationy, String history) {
        this.name = name;
        this.people = people;
        this.history = history;
        this.locationx = locationx;
        this.locationy = locationy;
    }

    public City(int id, int people, int locationx, int locationy, String name, String history) {
        this.id = id;
        this.people = people;
        this.history = history;
        this.locationx = locationx;
        this.locationy = locationy;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public int getLocationx() {
        return locationx;
    }

    public void setLocationx(int locationx) {
        this.locationx = locationx;
    }

    public int getLocationy() {
        return locationy;
    }

    public void setLocationy(int locationy) {
        this.locationy = locationy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City that = (City) o;
        return id == that.id && Objects.equals(people, that.people) && Objects.equals(history, that.history) && Objects.equals(locationx, that.locationx) && Objects.equals(locationy, that.locationy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, people, history, locationx, locationy);
    }

    @Override
    public String toString() {
        return "models.User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", people='" + people + '\'' +
                ", history='" + history + '\'' +
                ", locationx='" + locationx + '\'' +
                ", locationy='" + locationy + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}