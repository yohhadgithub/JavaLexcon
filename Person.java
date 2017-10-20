package com.lexicon;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    Person(){}
    Person(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Person(String firstName,String lastName,int age){
        this(firstName,lastName);
        this.age = age;
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

    public String getName(){
        return firstName + " " + lastName;
    }

    @Override
    public String toString(){
        return "toString " + firstName + " " + lastName + " " + age;
    }



}
