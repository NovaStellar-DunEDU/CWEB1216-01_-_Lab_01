package testlab01;
import java.util.Scanner;

public class mainProgram{
	
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		storageInfo storeObj = new storageInfo();
		colorStorage colorObj = new colorStorage();
		boolean programUpdate = true, studentUpdate = true, colorUpdate = true;
		
	    while (true)
	    {
	        System.out.println("What is your name?");

	        String name = myScanner.nextLine();
	        storeObj.setName(name);
	        
	        System.out.println("");

	        if (name.isEmpty())
	        {
	            System.out.println("Your input is empty. Try again.");
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
	        
	        if(storeObj.tryParseInt(StrAge, age) == true) {
	        	age = Integer.parseInt(StrAge);
	        	storeObj.setAge(age);
	        	break;
	        }
	        else 
	        {
	        	System.out.println("Invalid input. Try again.");
	        	continue;
	        }
	    }
	    
	    while (colorUpdate) {
	    	System.out.println("What is your favorite color?");
	    	String StrColor = myScanner.nextLine();
	    	
	    	colorObj.inputColor(StrColor);
	    	
	    	if(colorObj.getColor() != "") {
	    		break;
	    	}
	    	else {
	    		continue;
	    	}
	    }
	    
	    while (true)
	    {
	        System.out.println("\nWhat is your height, in meters?");

	        String StrHeight = myScanner.nextLine();
	        double height = 0.0;
	        
	        System.out.println("");
	        
	        if(storeObj.tryParseDouble(StrHeight, height) == true) {
	        	height = Double.parseDouble(StrHeight);
	        	storeObj.setHeight(height);
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
	        
	        if(storeObj.tryParseChar(StrChar, letter) == true) {
	        	letter = StrChar.charAt(0);
	        	storeObj.setChar(letter);
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
	    	if(storeObj.tryParseDouble(StrRadius, radius) == true) 
	    	{
	    		radius = Double.parseDouble(StrRadius);
	    		storeObj.setRadius(radius);
	    		storeObj.areaOfCircle();
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
	    		System.out.println("Your input is empty. Try again.");
	    		continue;
	    	}
	    	if (theCity.matches("\\d+")) {
	    		System.out.println("Invalid Input. Try again.");
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
	    	
	    	if (storeObj.tryParseDouble(STRtempsInCity, TempsInCity) == true) {
	    		TempsInCity = Double.parseDouble(STRtempsInCity);
	    		storeObj.setTemps(TempsInCity);
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
	    	
	    	if (storeObj.tryParseLong(STRPopulation, populationCity) == true) {
	    		populationCity = Long.parseLong(STRPopulation);
	    		storeObj.setPop(populationCity);
	    		break;
	    	}
	    	else 
	    	{
	    		continue;
	    	}
	    }
	    
	    while (programUpdate)
	    {
	        System.out.println("\nDo you like programming? [Y/N]");
	        String response = myScanner.nextLine();
	        
	        	switch (response) 
	        	{
	        	case "yes", "y", "Y", "Yes":
	        		storeObj.setProgram(true);
	        		programUpdate = false;
	        		break;
	        	case "no", "n", "No", "N":
	        		storeObj.setProgram(false);
	        		programUpdate = false;
	        		break;
	        	default:
	        		System.out.println("Invalid Input. Try again.");
	        		programUpdate = true;
	        		continue;
	        	}
	    }
	    
	    while (studentUpdate)
	    {
	        System.out.println("\nAre you a student? [Y/N]");
	        String response = myScanner.nextLine();
	        
	        	switch (response) 
	        	{
	        	case "yes", "y", "Y", "Yes":
	        		storeObj.setStudent(true);
	        		studentUpdate = false;
	        		break;
	        	case "no", "n", "No", "N":
	        		storeObj.setStudent(false);
	        		studentUpdate = false;
	        		break;
	        	default:
	        		System.out.println("Invalid Input. Try again.");
	        		studentUpdate = true;
	        		continue;
	        	}
	    }
	    
	    storeObj.display();
	}
}