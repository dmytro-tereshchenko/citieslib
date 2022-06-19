package com.example.citieslib.services;


import com.example.citieslib.dao.CityDao;
import com.example.citieslib.models.City;

import java.util.List;

public class CityService {

    private CityDao cityDao = new CityDao();

    public CityService() {
    }

    public City findCity(int id) {
        return cityDao.findById(id);
    }

    public void createCity(City city) {
        cityDao.create(city);
    }

    public void deleteCity(int cityid) {
        City entity = findCity(cityid);
        if(entity!=null){
            cityDao.delete(entity);
        }

    }

    public void updateCity(City city) {
        cityDao.update(city);
    }

    public List<City> findAllCities() {
        return cityDao.findAll();
    }

    public List<City> findConditions(String name, int people, String history){
        return cityDao.search(name, people, history);
    }
}