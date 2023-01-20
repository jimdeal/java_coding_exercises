package com.techreturners.exercise002;

class Person {
    private String pFirstName;
    private String pSurName;
    private String pCity;
    private Integer pAge;

    public Person(String firstName, String surname, String city, Integer age) {
        this.pFirstName = firstName;
        this.pSurName = surname;
        this.pCity = city;
        this.pAge = age;
    }

    public String getFirstName() {
        return pFirstName;
    }
    public String getSurname(){
        return pSurName;
    }
    public String getCity() {
        return pCity;
    }
    public int getAge(){
        return pAge;
    }
}


public class Exercise002 {
    private static final String MANCHESTER_STR = new String("Manchester");

    public boolean isFromManchester(Person person) {
        boolean ret = false;
        if(person != null)
        {
            ret = person.getCity().equals(MANCHESTER_STR);
        }
        return ret;
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        boolean ret = false;
        if(person != null)
        {
            ret = person.getAge()>=ageLimit;
        }
        return ret;
    }
    
}
