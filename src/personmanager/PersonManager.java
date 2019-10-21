/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmanager;

import java.util.ArrayList;

/**
 *
 * @author pgn
 */
public class PersonManager
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Array example:
        
        String[] arrPersons = new String[10];
        
        arrPersons[0] = "Trine";
        
        for (int i = 0; i < arrPersons.length; i++)
        {
            
        }
        
//        System.out.println(arrPersons[0]);
        
        //Eksempel med lister
        ArrayList<String> listPersons = new ArrayList<>();
        
        String aTeacher = new String("Lars");
        
        listPersons.add("Stegger");
        listPersons.add(aTeacher);
        listPersons.add("Trine");
        listPersons.remove(aTeacher); //Fjerner Jeppe fra pos. 1
        listPersons.add(aTeacher); //Lægger Jeppe ind bagerst
        
//        System.out.println(listPersons.get(0));
        
        for (String person : listPersons)
        {
            System.out.println(person);
        }
        
        for (int i = 0; i < listPersons.size(); i++)
        {
            
        }

        
        
        
    }

}
