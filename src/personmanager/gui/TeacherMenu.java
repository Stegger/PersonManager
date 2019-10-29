/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmanager.gui;

import java.util.List;
import personmanager.be.Person;
import personmanager.be.Teacher;
import personmanager.bll.PersonManager;

/**
 *
 * @author pgn
 */
public class TeacherMenu extends Menu
{

    public TeacherMenu(PersonManager personManager)
    {
        super(personManager, "Teacher menu", "Add teacher", "Get all teachers");
    }

    @Override
    protected void doAction(int option)
    {
        switch (option)
        {
            case 1:
                addTeacher();
                break;
            case 2:
                printAllTeachers();
                break;
        }
    }

    private void addTeacher()
    {
        System.out.print("Enter teacher name: ");
        String name = scanner.nextLine();
        System.out.println("Enter teacher id: ");
        String idAsString = scanner.nextLine();
        int id = Integer.parseInt(idAsString);
        Teacher teacher = new Teacher(id, name);
        personManager.addPerson(teacher);
        System.out.println("Teacher added");
        pause();
    }

    private void printAllTeachers()
    {
        List<Person> allPersons = personManager.getAllPersons();
        for (Person person : allPersons)
        {
            System.out.println(person);
        }
        pause();
    }

}
