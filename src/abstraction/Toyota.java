package abstraction;
public class Toyota extends  MotorVehicul implements Car{
	/*
     */
    public void shape() {// implemented from car interface
		System.out.println("the should have 5 feet width");	
	}
	public void wells() {// implemented from car interface
		System.out.println("the car should run on a wheels");
	}
    public void star() {// implemented from car interface
	System.out.println(" the car shoud have a start boton to run the engine");
    }
    public void stop() {// implemented from car interface
	System.out.println("the car should have a brake system");
	}
    public void autoStart() {//Toyota extends from MotorVehicul class. just the abstract methode.
	System.out.println("people in north america need  auto stat features");
    }
    public void floatingShape() {//we have access to those abstract methods because MotorVehicul implements boat. 
		System.out.println(" we are offering coller and models");	
	}
    public void sail() {//we have access to those abstract methods because MotorVehicul implements boat.
		System.out.println("people in north america need auto transmission");
	}
	public void color() {//it s a Toyota class methods.
		System.out.println("we are offring difrent collers and models ");
	}
	
     	}

