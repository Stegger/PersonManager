/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmanager.gui;

import java.util.ArrayList;
import java.util.List;
import personmanager.be.Person;
import personmanager.be.Teacher;

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
        
        persons.add(new Person(1, "Jeppe"));
        persons.add(new Person(2, "Peter"));
        persons.add(new Person(3, "Trine"));
        
        System.out.println("ID      NAME      EMAIL");
//        for (Person person : persons)
//        {
//            System.out.println(person.toString());
//        }
        
        Object obj = new Person(4, "Ole", "oe@easv.dk");
        Person prs = new Person(5, "Bent", "bhp@easv.dk");
        Object tch = new Teacher(6, "Henrik", "hk@easv.dk", "hk");
        
        
        System.out.println(obj.toString());
        System.out.println(prs.toString());
        System.out.println(tch.toString());
        
        
    }

}
