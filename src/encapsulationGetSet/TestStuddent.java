package encapsulationGetSet;

public class TestStuddent {

	public static void main(String[] args) {
		Student st1 = new Student();//object st1 from Student class.
		st1.setStId(101);//call set method.this gave us access to private variables(encapsulation)   
		st1.setStName("kacci");//call set method.this gave us access to private variables(encapsulation) 
		st1.setStDob("02-17-1985");//call set method.this gave us access to private variables(encapsulation) 
		
		System.out.println(st1.getStId()+" "+ st1.getStName()+ " "+ st1.getStDob());
		
	}

}
