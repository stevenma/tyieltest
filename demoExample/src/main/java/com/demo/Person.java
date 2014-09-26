package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private Long id;
    private String name;
    private Person managedBy;

    // ... insert getters and setters

    /**
     * Used to display the person.
     */
    public String toString() {
        return name;
    }
    public Person(Long id, String name)
    {
    	this.id=id;
    	this.name=name;
    }

    /**
     * Gets the list of possible managers from the database.
     */
    public static List<Person> getManagers() {
        // gets the managers from the database
    	List<Person> lstPerson=new ArrayList<Person>();
    	lstPerson.add(new Person(new Long(1),"person1"));
    	lstPerson.add(new Person(new Long(2),"person2"));
    	
    	return lstPerson;
    	
    }
}