
import java.util.ArrayList;
/**
 * Class List
 * Final Version: made by Nick Currie, Richard Unto, Andrew Tannler, and John Zazzera
 */
import java.util.ArrayList;
public class Driver

{
    //creates the arraylist
    private ArrayList <Classes> classes;
    
    //constructor
    public Driver()
    {
        classes = new ArrayList<>();
    }
    
    //adds a class so it can be output through the driver
    public void addClass(Classes c)
    {
        classes.add(c);
    }
    //a method that tests the program to show it works
    public void testScript()
    {
        Classes classes1 = new Classes(426 , 25, 25);
        Classes classes2 = new Classes(327, 18 , 14);
        Classes classes3 = new Classes(420, 20, 15);
        Classes classes4 = new Classes(317, 100, 90);
        addClass(classes1);
        addClass(classes2);
        addClass(classes3);
        addClass(classes4);
        listClasses();
        
    }
    public void listClasses()
    {
        //the header
        System.out.println("Room Number  Capacity   " +
        "Enrollment   Remaining Seats    Full/Not Full");
        //the loop that prints out the entire class list
        for(int x= 0; x < classes.size(); x++)
        { 
        
        Classes Class=classes.get(x);
        System.out.printf("%11d", Class.getroomNum());
        
          //Statement to print error message when enrollment is greater
          //than capacity
            if (Class.getCapacity() >= Class.getEnrollment())
        {System.out.printf("%10d", Class.getCapacity());
        System.out.printf("%13d", Class.getEnrollment());
        System.out.printf("%18d", Class.getRemainingSeats());
        System.out.printf("%17s %n", Class.isClassFull());
    }
            else
            System.out.printf("%58s %n", Class.errorMessage());

        }
    }

}
