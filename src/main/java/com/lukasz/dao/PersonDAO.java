package com.lukasz.dao;

import com.lukasz.model.Person;

import java.util.List;

public interface PersonDAO {

    void save(Person P);
    List<Person> list();

}
