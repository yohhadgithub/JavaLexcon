package com.lexicon;

public class Employee  extends Person{
    private int id;
    Employee(String firstName,String lastName,int age,int id){
        super(firstName,lastName,age);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return id +" " + this.getFirstName() + " " + this.getLastName() + " " + this.getAge();
    }
}
