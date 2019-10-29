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
public class GradeInfo
{

    private final String subject;

    private final int grade;

    /**
     * Creates a new grade for a given subject.
     *
     * @param subject
     * @param grade
     */
    public GradeInfo(String subject, int grade)
    {
        this.subject = subject;
        this.grade = grade;
    }

    /**
     * Get the value of grade
     *
     * @return the value of grade
     */
    public int getGrade()
    {
        return grade;
    }

    /**
     * Get the value of subject
     *
     * @return the value of subject
     */
    public String getSubject()
    {
        return subject;
    }

    @Override
    public String toString()
    {
        return subject + ": " + grade;
    }

}
