/* NovaStellar_DunEDU
 * Lab-01, CWEB1216-01
 * mainProgram.java
 * 2/11/2026
 * */

package testlab01;
import java.util.Scanner;

public class mainProgram{
	
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in); // Taking user Input
		storageInfo storeObj = new storageInfo(); // storageInfo.Java
		colorStorage colorObj = new colorStorage(); // colorStorage.Java
		boolean programUpdate = true, studentUpdate = true, colorUpdate = true;
		
	    while (true) // this while loop will be active unless a proper answer has been given
	    {
	        System.out.println("What is your name?"); // in this context it is asking for a name

	        String name = myScanner.nextLine(); // takes user's input
	        storeObj.setName(name); // stores into storageInfo.java
	        
	        System.out.println("");

	        if (name.isEmpty())
	        {
	            System.out.println("Your input is empty. Try again."); // If the user provides an empty string, they are prompted to try again.
	            continue;
	        }
	        if (name.matches("\\d+")) {
	        	System.out.println("Invalid input. Numbers are not allowed. Try again."); // If the user provides a number, they are prompted to try again.
    			System.out.println("");
	        }
	        else 
	        {
	        	break;
	        }
	    }
	    
	    while (true)
	    {
	        System.out.println("What is your age?");

	        String StrAge = myScanner.nextLine();
	        int age = 0;
	        
	        System.out.println("");
	        
	        if(storeObj.tryParseInt(StrAge, age) == true) { // checks for possible data conversion
	        	age = Integer.parseInt(StrAge); // if it is possible, then make this string into an integer
	        	storeObj.setAge(age); // stores the now newly converted integer into storageInfo.Java
	        	break;
	        }
	        else 
	        {
	        	System.out.println("Invalid input. Try again.");
	        	continue;
	        }
	    }
	    
	    while (colorUpdate) // switch case breaks while looping (can't use the argument [true] here)
	    {
	    	System.out.println("What is your favorite color?");
	    	String StrColor = myScanner.nextLine();
	    	
	    	colorObj.inputColor(StrColor); // see colorStorage.java
	    	
	    	if (colorObj.getColorName() == "None"){
	    		continue; // checks for invalid color name, then prompts the user again
	    	}
	    	else {
	    		break;
	    	}
	    	
	    }
	    
	    while (true)
	    {
	        System.out.println("\nWhat is your height, in meters?");

	        String StrHeight = myScanner.nextLine();
	        double height = 0.0;
	        
	        System.out.println("");
	        
	        if(storeObj.tryParseDouble(StrHeight, height) == true) { // data conversion check
	        	height = Double.parseDouble(StrHeight); // String to Double Conversion (see storageInfo.java)
	        	storeObj.setHeight(height); // Stores the now newly converted double
	        	break;
	        }
	        else 
	        {
	        	System.out.println("Invalid input. Try again.");
	        	continue;
	        }
	    }
	    
	    while (true)
	    {
	        System.out.println("What is your favorite character or letter?");

	        String StrChar = myScanner.nextLine();
	        char letter = ' ';
	        
	        System.out.println("");
	        
	        if(storeObj.tryParseChar(StrChar, letter) == true) { // data conversion check
	        	letter = StrChar.charAt(0); // looks for the first letter in the string sent
	        	storeObj.setChar(letter); // stores it into storageInfo.java
	        	break;
	        }
	        else 
	        {
	        	System.out.println("Invalid input. Try again.");
	        	continue;
	        }
	    }
	    
	    while (true) {
	    	System.out.println("Pick a number (CAN BE DECIMAL) for a radius of a circle.");
	    	
	    	String StrRadius = myScanner.nextLine();
	    	double radius = 0.0;
	    	
	    	System.out.println("");
	    	if(storeObj.tryParseDouble(StrRadius, radius) == true) // data conversion check
	    	{
	    		radius = Double.parseDouble(StrRadius); // String -> Double
	    		storeObj.setRadius(radius); // Stored
	    		storeObj.areaOfCircle(); // the formulas used: pi * r ^ 2
	    		break;
	    	}
	    	else 
	    	{
	    		System.out.println("Invalid Input. Try again.");
	    		continue;
	    	}
	    }
	    
	    while (true) {
	    	System.out.println("What city are you currently in?");
	    	String theCity = myScanner.nextLine();
	    	
	    	if (theCity.isEmpty()) {
	    		System.out.println("Your input is empty. Try again."); // No Response
	    		continue;
	    	}
	    	if (theCity.matches("\\d+")) {
	    		System.out.println("Invalid Input. Try again."); // A response with a number in it
	    		continue;
	    	}
	    	else 
	    	{
	    		storeObj.setCity(theCity);
	    		break;
	    	}
	    }
	    
	    while (true) {
	    	System.out.println("\nWhat is the temperature there in Celcius?");
	    	String STRtempsInCity = myScanner.nextLine();
	    	double TempsInCity = 0.0;
	    	
	    	if (storeObj.tryParseDouble(STRtempsInCity, TempsInCity) == true) { // data conversion check
	    		TempsInCity = Double.parseDouble(STRtempsInCity); // String -> Double
	    		storeObj.setTemps(TempsInCity); // Stored
	    		break;
	    	}
	    	else 
	    	{
	    		continue;
	    	}
	    }
	    
	    while (true) {
	    	System.out.println("\nWhat is the population of that city?");
	    	String STRPopulation = myScanner.nextLine();
	    	long populationCity = 0;
	    	
	    	if (storeObj.tryParseLong(STRPopulation, populationCity) == true) { // data conversion check
	    		populationCity = Long.parseLong(STRPopulation); // String -> Long
	    		storeObj.setPop(populationCity); // Stored
	    		break;
	    	}
	    	else 
	    	{
	    		continue;
	    	}
	    }
	    
	    while (programUpdate) // switch case breaks while looping
	    {
	        System.out.println("\nDo you like programming? [Y/N]");
	        String response = myScanner.nextLine();
	        
	        	switch (response) 
	        	{
	        	case "yes", "y", "Y", "Yes":
	        		storeObj.setProgram(true); // Yes
	        		programUpdate = false;
	        		break;
	        	case "no", "n", "No", "N":
	        		storeObj.setProgram(false); // No
	        		programUpdate = false;
	        		break;
	        	default:
	        		System.out.println("Invalid Input. Try again."); // Anything but a Yes Or No
	        		programUpdate = true;
	        		continue;
	        	}
	    }
	    
	    while (studentUpdate) // switch case breaks while looping
	    {
	        System.out.println("\nAre you a student? [Y/N]");
	        String response = myScanner.nextLine();
	        
	        	switch (response) 
	        	{
	        	case "yes", "y", "Y", "Yes":
	        		storeObj.setStudent(true); // Yes
	        		studentUpdate = false;
	        		break;
	        	case "no", "n", "No", "N":
	        		storeObj.setStudent(false); // No
	        		studentUpdate = false;
	        		break;
	        	default:
	        		System.out.println("Invalid Input. Try again."); // Anything but a Yes or No
	        		studentUpdate = true;
	        		continue;
	        	}
	    }
	    
	    myScanner.close();
	    storeObj.display(); // See storageInfo.java
	    
	}

}
