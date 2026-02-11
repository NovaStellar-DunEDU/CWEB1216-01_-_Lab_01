package testlab01;

public class storageInfo extends mainProgram{
	
	private String s1, s2; // Name, City
	private int i1 = 0; // Age
	private double d1 = 0.0F, d2 = 0.0F, d3 = 0.0F, result = 0.0F; // Height, Radius, Temperature, Area of Circle
	private char l1; // Favorite letter or character
	private boolean b1, b2; // Student, Programmer
	private final double PI = Math.PI; // PI
	private long lo1 = 0; // Population
	
	public void setName(String s1) {
		this.s1 = s1; // Stores Name
	}
	
	public String getName() {
		return s1; // Gets Name from Storage
	}
	
	public void setPop(long lo1) {
		this.lo1 = lo1; // Stores Population
	}
	
	public long getPop() {
		return lo1; // Gets Population from Storage
	}
	
	public void setCity(String s2) {
		this.s2 = s2; // Stores City
	}
	
	public String getCity() {
		return s2; // Gets City from Storage
	}
	
	public void setProgram(boolean b1) {
		this.b1 = b1; // Stores if the user is a programmer
	}
	
	public boolean getProgram() {
		return b1; // Gets if the user is a programmer
	}
	
	public void setStudent(boolean b2) {
		this.b2 = b2; // Stores if the user is a student
	}
	
	public boolean getStudent() {
		return b2; // Gets if the user is a student
	}
	
	public void setChar(char l1) {
		this.l1 = l1; // Stores a single letter or char
	}
	
	public char getChar() {
		return l1; // Gets a single letter or char
	}
	
	public void setAge(int i1) {
		this.i1 = i1; // Stores Age
	}
	
	public int getAge() {
		return i1; // Gets Age
	}
	
	public void setHeight(double d1) {
		this.d1 = d1; // Stores Height
	}
	
	public double getHeight() {
		return d1; // Gets Height
	}
	
	public void setRadius(double d2) {
		this.d2 = d2; // Stores Radius
	}
	
	public double getRadius() {
		return d2; // Gets Radius
	}
	
	public void setTemps(double d3) {
		this.d3 = d3; // Stores Temperatures
	}
	
	public double getTemps() {
		return this.d3; // Gets Temperatures
	}
	
	public double areaOfCircle() {
		result = Math.pow((PI * d2), 2); // Formula: PI*r^2 = A
		return result; // Uses the radius from before
	}
	
	// Data Conversion Checks
	// Checks if the string is empty or listed as null
	// Checks if it gets a NumberFormatException
	// Returns the result as true if it is possible
	
	public static boolean tryParseInt(String str, int result) {
		if (str == null || str.trim().isEmpty()) {
			return false;
		}
		try {
			result = Integer.parseInt(str.trim());
			return true;
		}
		catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static boolean tryParseDouble(String str, double result) {
		if (str == null || str.trim().isEmpty()) {
			return false;
		}
		try {
			result = Double.parseDouble(str.trim());
			return true;
		}
		catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static boolean tryParseLong(String str, long result) {
		if (str == null || str.trim().isEmpty()) {
			return false;
		}
		try {
			result = Long.parseLong(str.trim());
			return true;
		}
		catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static boolean tryParseChar(String str, char result) {
		if (str == null || str.trim().isEmpty()) {
			return false;
		}
		try {
			result = str.charAt(0);
			return true;
		}
		catch (NumberFormatException e) {
			return false;
		}
	}
	
	// Results
	
	public void display() {
		
		System.out.flush(); // Clears Console of previous clutter
		System.out.println("\nHello, " +  getName());
		System.out.println("You are " + d1 + " meters tall.");
		System.out.println(colorStorage.getColor() + "Your favorite color is: " + colorStorage.getColorName());
		System.out.println(colorStorage.RESET + "\nYour favorite character is: " + l1);
		System.out.printf("The area of the circle with the provided radius, " + d2 + " is: " + result);
		System.out.println("\n\nYou are currently in the city of: " + s2);
		System.out.println("The population of that city is: " + lo1);
		System.out.println("It is currently: " + d3 + " degrees Celcius.\n");
		if(getStudent() == true) {
			System.out.println("You are a student. To live is to learn.");
		}
		if(getProgram() == true) {
			System.out.println("You like programming. We will get along plenty.");
		}
	}
	
}