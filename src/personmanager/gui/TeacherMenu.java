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
public class TeacherMenu extends Menu
{
    
    public TeacherMenu()
    {
        super("Teacher menu", "Add teacher", "Get all teachers");
    }

    @Override
    protected void doAction(int option)
    {
        System.out.println("Option " + option + " was chosen");
    }
    
}