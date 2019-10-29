/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmanager.gui;

import personmanager.be.Person;
import personmanager.bll.PersonManager;

/**
 *
 * @author pgn
 */
public class MainMenu extends Menu
{

    public MainMenu(PersonManager personManager)
    {
        super(personManager, "Main menu", "Manage students", "Manage teachers", "See all persons");
    }

    @Override
    protected void doAction(int option)
    {
        switch (option)
        {
            case 1:
                new StudentMenu(personManager).run();
                break;
            case 2:
                new TeacherMenu(personManager).run();
                break;
            case 3:
                showAllPersons();
                break;
            default:
                //Do nothing.
                break;
        }
    }

    private void showAllPersons()
    {
        System.out.println("Showing all persons.");
        for (Person person : personManager.getAllPersons())
        {
            System.out.println(person);
        }
        pause();
    }

}
