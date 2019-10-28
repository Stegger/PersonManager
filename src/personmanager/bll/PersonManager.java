/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmanager.bll;

import java.util.ArrayList;
import java.util.List;
import personmanager.be.Person;
import personmanager.be.Student;
import personmanager.be.Teacher;

/**
 *
 * @author pgn
 */
public class PersonManager
{

    private List<Person> persons;
    

    public PersonManager()
    {
        persons = new ArrayList<>();
    }

    /**
     * Gets the person with the given id.
     *
     * @param id The id of the person
     * @return The person object with the given id
     */
    public Person getPerson(int id)
    {
        for (Person person : persons)
        {
            if (person.getId() == id)
            {
                return person;
            }
        }
        return null;
    }

    /**
     * Add a person to the manager.
     *
     * @param p The Person to add.
     */
    public void addPerson(Person p)
    {
        persons.add(p);
    }

    /**
     * Removes the person with the given ID.
     *
     * @param id The id of the person to remove.
     */
    public void removePerson(int id)
    {
        for (int i = 0; i < persons.size(); i++)
        {
            if (persons.get(i).getId() == id)
            {
                persons.remove(i);
                return;
            }
        }
    }

    /**
     * Gets the list of all persons.
     *
     * @return
     */
    public List<Person> getAllPersons()
    {
        return persons;
    }

    /**
     *
     * @return
     */
    public List<Teacher> getAllTeachers()
    {
        return null;
    }

    public List<Student> getAllStudents()
    {
        return null;
    }

}
