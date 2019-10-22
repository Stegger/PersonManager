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
public class Teacher extends Person
{

    private String initials;

    public Teacher(int id, String name, String email, String initials)
    {
        super(id, name, email);
        this.initials = initials;
    }

    public String getInitials()
    {
        return initials;
    }

    public void setInitials(String initials)
    {
        this.initials = initials;
    }

}
