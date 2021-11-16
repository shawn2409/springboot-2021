package com.example.model;





public class Country {
    int id;
    String countryName;
    long population;
   // Person person;

    public Country() {
        super();
    }

    public Country(int id, String countryName, long population) {
        this.id = id;
        this.countryName = countryName;
        this.population = population;
       // this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

//    public Person getPerson() {
//        return person;
//    }
//
//    public void setPerson(Person person) {
//        this.person = person;
//    }

}