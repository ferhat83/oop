package abstraction;

public abstract class MotorVehicul implements Boat {//abstract method withe 2 methods non abstract and abstract.
   public void engine() {//non abstract method.
	System.out.println("lets have en engine to start the car");
	
}
   public abstract void autoStart();// abstract methode.
}
