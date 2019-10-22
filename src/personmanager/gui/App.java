/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmanager.gui;

import java.util.ArrayList;
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
       
        Person p1 = new Teacher(1, "Peter", "pgn@easv.dk", "pgn");
        Person p2 = new Teacher(2, "Jeppe", "jml@easv.dk", "jml");
        Person p3 = new Teacher(3, "Trine", "tgh@easv.dk", "tgh");
        
        Teacher ole = new Teacher(4, "Ole", "oe@easv.dk", "oe");
        
        
        
        
        System.out.println("Oles id is " + ole.getId());
        
        
        
        
    }

}
