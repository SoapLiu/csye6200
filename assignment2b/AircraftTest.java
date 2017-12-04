package assign2ac;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Aircraft Test Program Class
 * 
 * @author Yi Liu
 * NUID: 001819429
 *
 */
public class AircraftTest {
	/**
	 * AircraftTest constructor
	 */
	public AircraftTest() {
	  // Create the default list to hold the aircraft
      // Create the default aircraft
      //	 ac1 = new Aircraft(1,128380,920,"Boeing","747", 112760,0.2);
      // ac2 = new Aircraft(2,119833,905,"Boeing","777",102000,0.188);
	}
	
	public void run() {
		
		Aircraft a1 = new Aircraft("N1762J",1000,20000,53000,12302);
		Aircraft a2 = new Aircraft("N2851J",900,18000,51000,21343);
		Aircraft a3 = new Aircraft("N3963J",1100,23000,54000,23578);
		Aircraft a4 = new Aircraft("N4396J",890,18000,49000,23132);
		Aircraft a5 = new Aircraft("N5235J",1200,25000,55000,12422);
		
/*----------------maxCargoCap Test---------------------------------------------*/	
		System.out.println("");
		System.out.println("*-----test maxCargoCap-----*");
		System.out.println("");

		System.out.println("a1's maximum available cargo capacity is: " + a1.maxCargoCap());
		System.out.println("a2's maximum available cargo capacity is: " + a2.maxCargoCap());
		System.out.println("a3's maximum available cargo capacity is: " + a3.maxCargoCap());
		System.out.println("a4's maximum available cargo capacity is: " + a4.maxCargoCap());
		System.out.println("a5's maximum available cargo capacity is: " + a5.maxCargoCap());



/*----------------ArrayList Test---------------------------------------------*/		
		AircraftFleet af = new AircraftFleet();
		
		ArrayList<Aircraft> aircraftList = new ArrayList<Aircraft>();
		
		af.setAircraftList(aircraftList);

		System.out.println("");
		System.out.println("*-----test addAircraftList()-----*");
		System.out.println("*-----add a1-----*");
		System.out.println("");
		
		af.addAircraftList(a1);
		
		af.printAircraftList();
		
		System.out.println("*-----add a2, a3, a4, a5-----*");
		
		af.addAircraftList(a2);
		af.addAircraftList(a3);
		af.addAircraftList(a4);
		af.addAircraftList(a5);

		af.printAircraftList();
		
		System.out.println("");
		System.out.println("*-----test removeAircraftList()-----*");
		System.out.println("*-----remove No.1-----*");
		System.out.println("");
		
		af.removeAircraftList(0);
		af.printAircraftList();


/*----------------HashMap Test---------------------------------------------*/	
		
		HashMap<String, Aircraft> map = new HashMap<String, Aircraft>();
		af.setAircraftMap(map);
		
		af.addAircraftMap(a1);
		af.addAircraftMap(a2);
		af.addAircraftMap(a3);
		af.addAircraftMap(a4);
		af.addAircraftMap(a5);
		
		System.out.println("");
		System.out.println("*-----test retrieve an airplane by ID string-----*");
		System.out.println("");
		
		System.out.println("please enter the ID tail number.");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
					
		System.out.println("aircraftID:\t" + af.getAircraftMap(s).getAcId());
		System.out.println("fuelCap:\t" + af.getAircraftMap(s).getFuelCap());
		System.out.println("acWeight:\t" + af.getAircraftMap(s).getAcWeight());

	}

	/**
	 * Print the aircraft to the console
	 */
	
	/**
	 * This is where we start (just like a C/C++ program)
	 * @param args
	 */
	public static void main(String[] args) {
		AircraftTest test = new AircraftTest();
		test.run();
	}

}
