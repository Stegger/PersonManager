/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmanager.gui;

import java.util.ArrayList;
import java.util.List;
import personmanager.be.Person;

/**
 *
 * @author pgn
 */
public class App
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       
        ArrayList<Person> persons = new ArrayList<>();
        
        persons.add(new Person(10, "Jeppe"));
        persons.add(new Person(2, "Jeppe"));
        persons.add(new Person(3, "Jeppe"));
        
        System.out.println("ID      NAME      EMAIL");
        for (Person person : persons)
        {
            System.out.println(person);
        }
    }

}
