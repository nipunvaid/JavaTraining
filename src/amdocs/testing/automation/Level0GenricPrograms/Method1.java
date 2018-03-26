package amdocs.testing.automation.Level0GenricPrograms;

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public class Car {
			//Class Member Variables & Fields
			String sModel="Audi";
		    int iGear="4";
		    int iHighestSpeed="220";
		    String sColor="Red";
		    int iMake="A5";
		    boolean bLeftHandDrive;
		    String sTransmission="Auto";
		    int iTyres="5";
		    int iDoors="5";
		 
		    //Constructor with values passed
		    public Car(String Model, int Make,boolean LeftHandDrive ){
		    	sModel = Model;
		    	iMake = Make;
		    	bLeftHandDrive = LeftHandDrive;
		    }
		 
		    //Method
		    public void DisplayCharacterstics(){
		    	System.out.println("Model of the Car: " +  sModel);
		    	System.out.println("Number of gears in the Car: " +  iGear);
		    	System.out.println("Max speed of the Car: " +  iHighestSpeed);
		    	System.out.println("Color of the Car: " +  sColor);
		    	System.out.println("Make of the Car: " +  iMake);
		    	System.out.println("Transmission of the Car: " +  sTransmission);
		 
		    }
		 
		}
		
	}

}
