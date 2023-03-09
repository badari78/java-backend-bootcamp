package io.javabrains.javacollections;

/*
Generate a Person class with the member variables firstName, lastName, age, lastModifiedDate.
Generate equals and hashcode methods using member variables firstName, lastName, age
Compare two instances of Person that have the same data
*/

import java.util.Date;

public class EqualsAndHashCode {

    public static void main(String[] args) {

    }
}

class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Date lastModifiedDate;

    public Person(String firstName, String lastName, int age, Date lastModifiedDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}