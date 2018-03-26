package amdocs.testing.automation.Level1GenericPrograms;


public class StaticModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        car Toyota = new car();
	        Toyota.sModel="Camry";
	        Toyota.iHighestSpeed = 230;
	        car.iDoors = 2;
	 
	        System.out.println("Model of the Car: " + Toyota.sModel);
	        System.out.println("Max speed of the Car: " + Toyota.iHighestSpeed);
	       // System.out.println("Number of Wheels in the Car: " + Toyota.iWheel); //Compile Time Error
	     System.out.println("Number of Wheels in the Car: " + car.iWheels);
	      System.out.println("Number of Steering in the Car: " + car.iSteering);
	    System.out.println("Number of Doors in the Car: " + car.iDoors);
	         }
		
	}