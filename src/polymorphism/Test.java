package polymorphism;

public class Test {

	public static void main(String[] args) {
		
		Overloading cal = new Overloading ();
		int line = cal.areaOfLand(4, 5);
		System.out.println(line);
		
		int triangle= cal.areaOfLand(4, 5, 6);
		System.out.println(triangle);
		
		int rectangle= cal.areaOfLand(6, 7, 9, 4);
		System.out.println(rectangle);
		
		Overriding invit = new Overriding ();
		
		int rec = invit.areaOfLand(6, 7, 9, 4);
		System.out.println(rec);
		
		
	}
     
}
