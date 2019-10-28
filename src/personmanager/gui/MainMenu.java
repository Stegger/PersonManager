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
public class MainMenu extends Menu
{

    public MainMenu()
    {
        super("Main menu", "Manage students", "Manage teachers");
    }

    @Override
    protected void doAction(int option)
    {
        switch (option)
        {
            case 1:
                new StudentMenu().run();
                break;
            case 2:
                new TeacherMenu().run();
                break;
            default:
                //Do nothing.
                break;
        }
    }

}
