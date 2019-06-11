/*
  For the moment it is used to illustrate placeholder
  Implements IRepository
  TODO to put more logic into Person Repository
 */

package repository;


import model.people.Person;

import java.util.List;

public class PersonRepository implements IRepository <Person>{

    @Override
    public List<Person> findAll() {
        return null;
    }

    @Override
    public Person findByName(String name) {
        return null;
    }

    @Override
    public boolean addEntity(Person entity) {
        return true;

    }

    @Override
    public void removeEntity(Person entity) {

    }
}