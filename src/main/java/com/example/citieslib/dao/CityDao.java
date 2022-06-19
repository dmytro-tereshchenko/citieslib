package com.example.citieslib.dao;

import com.example.citieslib.models.City;
import com.example.citieslib.utils.HibernateSessionFactoryUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CityDao {

    public City findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(City.class, id);
    }

    public void create(City city) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(city);
        tx1.commit();
        session.close();
    }

    public void update(City city) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(city);
        tx1.commit();
        session.close();
    }

    public void delete(City city) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(city);
        tx1.commit();
        session.close();
    }

    public List<City> findAll() {
        List<City> cities = (List<City>)  HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession()
                .createQuery("FROM City")
                .list();
        return cities;
    }

    public List<City> search(String name, int people, String history) {

        List<City> cities = (List<City>)  HibernateSessionFactoryUtil
                .getSessionFactory()
                .openSession()
                .createQuery("FROM City")
                .list();

        if(name!=null&&name!=""){
            cities = cities.stream().filter(city ->
                            city.getName().contains(name))
                    .collect(Collectors.toList());
        }
        if(people>0){
            cities = cities.stream().filter(city ->
                            city.getPeople()>people)
                    .collect(Collectors.toList());
        }
        if(history!=null&&history!=""){
            cities = cities.stream().filter(city ->
                            city.getHistory().contains(history))
                    .collect(Collectors.toList());
        }
        return cities;
    }
}