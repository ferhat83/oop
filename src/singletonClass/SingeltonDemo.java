package singletonClass;

public class SingeltonDemo {
	public static SingeltonDemo sd= new SingeltonDemo();//create singlton static object
	int temp;
	private SingeltonDemo() {}// privat constractor 
	   
	public static SingeltonDemo getInstance() { // create getInstance methode
		return sd;
	}
//this  mean the object of this class is just created when we call the getInstance method.
}
