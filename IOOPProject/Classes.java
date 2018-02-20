
import java.util.ArrayList;

public class Classes
{


    // creates the arraylist to store the class information
    private ArrayList<Integer> info;
   
    //creates the class through user input 
    public Classes(int roomNum, int cap, int enroll)
    {
       info = new ArrayList<Integer>();
    
        //adds the input into the arraylist
        info.add(roomNum);
        info.add(cap);
        info.add(enroll);
        
        //calculates remaining seats
       int capacity = info.get(1);
       int enrollment = info.get(2);
       int remainingSeats= capacity - enrollment;
        //adds remaining seats to arraylist
       info.add(remainingSeats);
    }
    
    

    //determines if the class is full by seeing if the remaining seats are equal to zero
    public String isClassFull()
    {
        int seats = info.get(3);
        if(seats == 0)
            return "Full";
        else
          return "Not Full";
    }
    //returns the room number
    public int getroomNum()
    {
        return info.get(0);
    }
    
    //returns the capacity of the classroom
    public int getCapacity()
    {
        return info.get(1);
    }
    //returns the number of people enrolled in the class
    public int getEnrollment()
    {
        return info.get(2);
    }
    
    //returns how many seats are remaining in the classroom
    public int getRemainingSeats()
    {
        return info.get(3);
    }
    
    public String errorMessage()
    {
        return "Error: Enrollment cannot be greater than capactity";
    }
}
