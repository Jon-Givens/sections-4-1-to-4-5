import javax.swing.*;

public class NameMaker_4_3 {
    
    public static void main(String args[])
    {
        String firstName;
        String middleName;
        String lastName;
        String fullName;

        firstName = JOptionPane.showInputDialog( "Enter a first name" );
        middleName = JOptionPane.showInputDialog( "Enter a middle name" );
        lastName = JOptionPane.showInputDialog( "Enter a last name" );
        fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(fullName);
    }
    
}
