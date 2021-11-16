package com.example.service.imp;

import com.example.model.Person;
import com.example.repo.PersonRepository;
import com.example.service.PersonInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class PersonInformationServiceImp implements PersonInformationService {

    @Autowired
    private final PersonRepository personRepository;

    public PersonInformationServiceImp(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAllPersons() {

        return personRepository.findAll();
    }

    @Override
    public List<Person> getGetAllPersonsByCity(String city) {
        return personRepository.findPersonByCity(city);
    }

    @Override
    public Person getPersonById(int id) {
        return personRepository.findPersonById(id);
    }

    @Override
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person updatePerson(Person person) {
        Person personDetails = personRepository.findPersonById(person.getId());
        if (personDetails != null) {
            personDetails.setName(person.getName());
            personDetails.setCity(person.getCity());

            return personRepository.save(personDetails);
        } else {


            return null;
        }
    }

    @Override
    public void deletePerson(int id) {
        personRepository.deletePersonById(id);


    }
}
