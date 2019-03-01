 package enumm;

public class enumTest {
	
	enum Color{ RED, GREEN, BLUE}//enum constants are final and static by default. 
	             //we can use them just using class name Color.
	    
	    // Driver method 
	    public static void main(String[] args) {
	    
	        Color c1 = Color.BLUE; //we have access to the constants of enum they are final and static. 
	        Color c2  = Color.GREEN;
	        Color c3 = Color.RED;
	        
	        System.out.println(c1); 
	        System.out.println(c2);
	        System.out.println(c3);
	    } 
	} 


