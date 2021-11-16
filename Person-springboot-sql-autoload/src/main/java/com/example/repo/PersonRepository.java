package com.example.repo;

import com.example.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

    //derived method
    List<Person> findPersonByCity(String city);
    Person findPersonById(int id);
    void deletePersonById(int id);

}
