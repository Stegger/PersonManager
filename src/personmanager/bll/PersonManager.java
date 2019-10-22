/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmanager.bll;

import java.util.ArrayList;
import java.util.List;
import personmanager.be.Person;
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
    
    public Person getPerson(int id)
    {
        return null;
    }
    
    public void addPerson(Person p)
    {
        
    }
    
    public void removePerson(int id)
    {
        
    }

    public List<Person> getAllPersons()
    {
        return persons;
    }
    
    
    
    public List<Teacher> getAllTeachers()
    {
        return null;
    }
    
    
    
}
