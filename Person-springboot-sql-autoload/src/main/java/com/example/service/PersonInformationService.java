package com.example.service;

import com.example.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface PersonInformationService {

    List<Person> getAllPersons();

    List<Person> getGetAllPersonsByCity(String city);

    Person getPersonById(int id);

    Person savePerson(Person person);

    Person updatePerson(Person person);

    void deletePerson(int id);


}
