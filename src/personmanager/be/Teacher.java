/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmanager.be;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pgn
 */
public class Teacher extends Person
{

    private List<String> subjects;
    private String initials;
    private double salary;

    public Teacher(int id, String name)
    {
        super(id, name);
        subjects = new ArrayList<>();
    }

    public Teacher(int id, String name, String email, String initials)
    {
        super(id, name, email);
        this.initials = initials;
        subjects = new ArrayList<>();
    }

    public Teacher(int id, String name, String email, String initials, List<String> subjects)
    {
        super(id, name, email);
        this.initials = initials;
        this.subjects = subjects;

    }

    public String getInitials()
    {
        return initials;
    }

    public void setInitials(String initials)
    {
        this.initials = initials;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        String output = super.toString() + "      " + initials;
        if (!subjects.isEmpty())
        {
            output += subjects.get(0);
        }
        return output;
    }

}
