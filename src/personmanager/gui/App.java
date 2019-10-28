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
import personmanager.bll.PersonManager;

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
        PersonManager personManager = new PersonManager();
        Menu menu = new MainMenu(personManager);
        menu.run();
    }

}