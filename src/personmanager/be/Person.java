/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmanager.be;

/**
 *
 * @author pgn
 */
public class Person
{

    private final int id;
    protected String name;
    private String email;

    public Person(int id, String name)
    {
        this(id, name, "");
    }

    public Person(int id, String name, String email)
    {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    @Override
    public String toString()
    {
        return id + "      " + name + "       " + email;
    }

}
