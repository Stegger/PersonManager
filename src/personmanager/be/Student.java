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
public class Student extends Person
{

    private List<GradeInfo> gradeReport;
    private String education;

    public Student(int id, String name, List<GradeInfo> gradeReport, String education)
    {
        super(id, name);
        this.gradeReport = gradeReport;
        this.education = education;
    }

    public Student(int id, String name)
    {
        this(id, name, new ArrayList<GradeInfo>(), "");
    }

    public void addGrade(GradeInfo grade)
    {
        gradeReport.add(grade);
    }

}
