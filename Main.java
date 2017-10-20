package com.lexicon;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Kalle","Karlsson",14);
        Employee person2 = new Employee("Pelle ","Persson",22,4);

        System.out.println(person1);
        System.out.println(person2);
    }
}
