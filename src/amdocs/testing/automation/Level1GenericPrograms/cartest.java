package amdocs.testing.automation.Level1GenericPrograms;

public class cartest {

			 
		public void main(String[] args) {
			car Toyota = new car();
			Toyota.sModel="Camry";
			Toyota.iGear = 5;
			Toyota.iHighestSpeed = 230;
	 
			Toyota.DisplayCharacterstics();
			}
}

public class vehicle {
	public String sModel;
	public int iGear;
	public int iHighestSpeed;

void DisplayCharacterstics(){
	System.out.println("Model of the Car: " + sModel);
	System.out.println("Number of gears in the Car: " + iGear);
	System.out.println("Max speed of the Car: " + iHighestSpeed);
	}
}
