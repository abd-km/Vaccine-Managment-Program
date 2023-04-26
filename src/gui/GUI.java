
package gui;


public class GUI {
   

    public static void main(String[] args) 
    {
        usertype ff = new usertype();
        ff.setVisible(true);
        
    }
    
}

/*
GUI FLOWS

MainGUI > PeopleGUI > LoginGUI > ListGUI > AppointmentsGUI > AppBookGUI
                                                             AppCancelGUI
                                                             AppViewGUI

                                           VaccinationGUI  > VaccViewGUI    > Center Wise (GUI)
                                                                            > Vaccine Wise (GUI)

                                                           > VaccSearchGUI  > Center Wise (GUI)
                                                                            > Vaccine Wise (GUI)

                                           PersonalGUI     > PModifyGUI    
                                                             PViewGUI
                                           

OR

MainGUI > PeopleGUI > RegisterGUI > Successful? > MainGUI





*/