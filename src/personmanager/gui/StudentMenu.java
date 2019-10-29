/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmanager.gui;

import personmanager.be.Student;
import personmanager.be.Teacher;
import personmanager.bll.PersonManager;

/**
 *
 * @author pgn
 */
public class StudentMenu extends Menu
{

    public StudentMenu(PersonManager personManager)
    {
        super(personManager, "Student menu", "Add student", "Get all students");
    }

    @Override
    protected void doAction(int option)
    {
        switch (option)
        {
            case 1:
                addAStudent();
                break;
            case 2:
                showAllStudents();
                break;
        }
    }

    private void addAStudent()
    {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student id: ");
        String idAsString = scanner.nextLine();
        int id = Integer.parseInt(idAsString);
        Student student = new Student(id, name);
        personManager.addPerson(student);
        System.out.println("Student added.");
        pause();
    }

    private void showAllStudents()
    {
        for (Student student : personManager.getAllStudents())
        {
            System.out.println(student);
        }
        pause();
    }

}
