package assign2ac;
/**
 * Aircraft Test Program Class
 * 
 * @author Yi Liu
 * NUID: 001819429
 *
 */
public class AircraftTest {

	// A holder for an aircraft instance - perhaps an array of some form would be useful instead.
	public Aircraft ac1;
	public Aircraft ac2;
	/**
	 * AircraftTest constructor
	 */
	public AircraftTest() {
	  // Create the default list to hold the aircraft
      // Create the default aircraft
	ac1 = new Aircraft(1,128380,920,"Boeing","747", 112760,0.2);
	ac2 = new Aircraft(2,119833,905,"Boeing","777",102000,0.188);

	}

	/**
	 * Print the aircraft to the console
	 */
	public void printAircraft() {
	  // Display all aircraft that we know about - loop through our list and print them
		System.out.println("Crew Number\t\t" + ac1.crewNum + "\t" + ac2.crewNum + "\t");
		System.out.println("Fuel Capacity(KG)\t" + ac1.fuelCap + "\t" + ac2.fuelCap + "\t");
		System.out.println("Cruise Speed(KM/H)\t" + ac1.cruiseSpeed + "\t" + ac2.cruiseSpeed + "\t");
		System.out.println("Vendor\t\t\t" + ac1.vendor + "\t" + ac2.vendor + "\t");
		System.out.println("Type\t\t\t" + ac1.type + "\t" + ac2.type + "\t");
		System.out.println("Mpg(MilePerGallon)\t" + ac1.mpg + "\t" + ac2.mpg + "\t");
		System.out.println("Range(Mile)\t\t" + (int)ac1.range() + "\t" + (int)ac2.range() + "\t");
		System.out.println("Payload\t\t\t" + ac1.payload + "\t" + ac2.payload + "\t");

	}
	
	/**
	 * This is where we start (just like a C/C++ program)
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Our Aircraft test program is starting");
		AircraftTest acTest = new AircraftTest();
		acTest.printAircraft();
		System.out.println("Our Aircraft test program is ending");
	}

}
