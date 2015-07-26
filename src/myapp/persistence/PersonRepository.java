package myapp.persistence;

import myapp.model.Person;

import java.util.List;

/**
 * Created by bruno.devesa on 26-07-2015.
 */
public interface PersonRepository {

    /**
     * inserts an entity and commits
     *
     * @param entity
     * @return the persisted entity
     */
    public Person add(Person entity);


    /**
     * reads an entity given its ID
     *
     * @param id
     * @return
     */
    public Person findById(Integer id);



    /**
     * Returns the List of all entities in the persistence store
     *
     * @return
     */
    public List<Person> findAll();
}
