package myapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by bruno.devesa on 26-07-2015.
 */
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPerson;

    private String name;

    public Person() {
    // for ORM purposes
    }

    public Person(String name) {
        this.name = name;
    }
}
