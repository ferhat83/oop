package abstraction;

public class TestCar {
	public static void main(String[] args) {
		Car corrola = new Toyota();//create object corrola. using Toyota gave us access to Car class
		corrola.shape();//call the method from toyota class
		corrola.wells();//call the method from toyota class
		corrola.star();//call the method from toyota class
		corrola.stop();//call the method from toyota class
		
		Toyota lexus = new Toyota();//create object lexus from toyota class
		lexus.color();//call the methode color from toyota class

		MotorVehicul mv = new Toyota();//create object mv. using Toyota gave us access to MotorVehicul class
		mv.autoStart();
		mv.engine();

		Boat boat = new Toyota();//create object boat. using Toyota gave us access to Boat class.
		boat.floatingShape();
	} 

}
