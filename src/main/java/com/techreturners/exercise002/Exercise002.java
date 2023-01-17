package com.techreturners.exercise002;

class Person {
    private String pFName;
    private String pSName;
    private String pCity;
    private Integer pAge;

    public Person(String firstName, String surname, String city, Integer age) {
        this.pFName = firstName;
        this.pSName = surname;
        this.pCity = city;
        this.pAge = age;
    }

    public String getFirstName() {
        return pFName;
    }
    public String getSurname(){
        return pFName;
    }
    public String getCity() {
        return pCity;
    }
    public int getAge(){
        return pAge;
    }
}


public class Exercise002 {
    public boolean isFromManchester(Person person) {
        return person.getCity().compareTo("Manchester")==0;
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        return person.getAge()>=ageLimit;
    }
    
}
