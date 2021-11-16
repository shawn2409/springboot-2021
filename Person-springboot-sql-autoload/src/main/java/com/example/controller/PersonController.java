package com.example.controller;

import com.example.model.Person;
import com.example.service.PersonInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping(path = PersonController.PATH)
public class PersonController {

    public static final String PATH = "/persons";

    @Autowired
    private final PersonInformationService personInformationService;


    public PersonController(PersonInformationService personInformationService) {
        this.personInformationService = personInformationService;
    }

    @GetMapping("/persons")
    List<Person> getAllPersons() {

        return personInformationService.getAllPersons();

    }

    @GetMapping("/{city}")
    private List<Person> getPersonsByCity(@PathVariable("city") String city) {
        return personInformationService.getGetAllPersonsByCity(city);
    }

    @GetMapping("/person/{id}")
    Person getPersonByCity(@PathVariable("id") int id) {

        return personInformationService.getPersonById(id);

    }

    @PostMapping("/person")
    Person savePerson(@RequestBody Person person) {
        return personInformationService.savePerson(person);
    }

    @PutMapping("/person/update")
    String updatePerson(@RequestBody Person person) {
        personInformationService.updatePerson(person);
        return "Person updated";
    }

    @DeleteMapping("/person/{id}")
    public void deletePerson(@PathVariable("id") int id) {

        personInformationService.deletePerson(id);

    }


}
