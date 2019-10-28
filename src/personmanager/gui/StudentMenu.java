/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmanager.gui;

/**
 *
 * @author pgn
 */
public class StudentMenu extends Menu
{

    public StudentMenu()
    {
        super("Student menu", "Add student", "Get all students", "Take a break");
    }

    @Override
    protected void doAction(int option)
    {
        System.out.println("You chose " + option);
    }
    
   
    
}
