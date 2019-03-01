package enumm;

	
	// A Java program to demonstrate working on enum 
	// in switch case (Filename Test. Java) 
	
	  
	// An Enum class 
	enum Day 
	{ 
	    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
	    THURSDAY, FRIDAY, SATURDAY;// days are enum constants 
	} 
	  
	// Driver class that contains an object of "day" and 
	// main(). 
	public class Test 
	{ 
	    Day day; 
	  
	    
	    // Constructor 
	    public Test(Day day) 
	    { 
	        this.day = day; 
	    } 
	  
	    // Prints a line about Day using switch 
	    public void dayIsLike() 
	    { 
	        switch (day) // switch conditional statement
	        { 
	        case MONDAY: 
	            System.out.println("Mondays are bad."); 
	            break; // break the test and check the next condition.
	        case FRIDAY: 
	            System.out.println("Fridays are better."); 
	            break; 
	        case SATURDAY: 
	        case SUNDAY: 
	            System.out.println("Weekends are best."); 
	            break; 
	        default: 
	            System.out.println("Midweek days are so-so."); 
	            break; 
	        } 
	    } 
	  
	    // Driver method 
	    public static void main(String[] args) 
	    { 
	        String str = "MONDAY"; 
	        Test t1 = new Test(Day.valueOf(str)); 
	        t1.dayIsLike(); 
	    } 
	} 

