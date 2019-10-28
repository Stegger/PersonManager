/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmanager.gui;

import java.util.Scanner;

/**
 *
 * @author pgn
 */
public abstract class Menu
{

    // value used to exit the menu.
    // the value can be changed by the sub-class constructor.
    protected int EXIT_OPTION = 0;

    private String header;
    private String[] menuItems;
    private String inputText = "Please choose your menu option:";
    protected Scanner scanner;

    /**
     * Creates an instance of the class with the given header text and menu
     * options.
     *
     * @param header The header text of the menu.
     * @param menuItems The list of menu items texts.
     */
    public Menu(String header, String... menuItems)
    {
        this.header = header;
        this.menuItems = menuItems;
        scanner = new Scanner(System.in);
    }

    /**
     * Returns a valid menu-option input from the keyboard. The method continues
     * prompting for an option value, until a valid option has been input.
     *
     * @return A valid menu option.
     */
    private int getOption()
    {
        int nr = -1;
        while (nr < 0)
        {
            System.out.print(inputText);
            String nrAsString = scanner.nextLine();
            try
            {
                nr = Integer.parseInt(nrAsString.trim());
            } catch (NumberFormatException nfe)
            {
                //Do nothing, we will try again.
            }
            if (nr > menuItems.length) //If number is out of range, we change it to negative one
            {
                System.out.println("Please choose an option in range (0-" + menuItems.length + ")");
                nr = -1;
            }
        }
        return nr;
    }

    /**
     * Abstract method stating what should be done, when a menu option is
     * selected. The method must be overridden by the sub-class.
     *
     * @param option the menu option that has been selected.
     */
    protected abstract void doAction(int option);

    /**
     * Executes the menu until the EXIT_OPTION has been selected. This is an
     * implementation of the Template Method design pattern.
     */
    public void run()
    {
        boolean done = false;
        while (!done)
        {
            showMenu();
            int option = getOption();
            doAction(option);
            if (option == EXIT_OPTION)
            {
                done = true;
            }
        }
    }

    /**
     * Prints out a console menu with a header text and a list of menu options.
     * The menu options will be assigned the numbers from 1 to the number of
     * options in the menu.
     */
    private void showMenu()
    {
        System.out.println(header);
        for (int i = 0; i < menuItems.length; i++)
        {
            System.out.println((i + 1) + ": " + menuItems[i]);
        }
        int option = getOption();
        doAction(option);
    }

    /**
     * Waits until the 'enter' key is pressed.
     */
    protected void pause()
    {
        System.out.println("Hit enter to continue...");
        scanner.nextLine();
    }

    /**
     * Clears the screen by writing several empty lines.
     */
    protected void clear()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("");
        }
    }

}
