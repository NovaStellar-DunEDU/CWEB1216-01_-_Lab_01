package testlab01;

public class storageInfo extends mainProgram{
	
	private String s1, s2;
	private int i1 = 0;
	private double d1 = 0.0F, d2 = 0.0F, d3 = 0.0F, result = 0.0F;
	private char l1;
	private boolean b1, b2;
	private final double PI = Math.PI;
	private long lo1 = 0;
	
	public void setName(String s1) {
		this.s1 = s1;
	}
	
	public String getName() {
		return s1;
	}
	
	public void setPop(long lo1) {
		this.lo1 = lo1;
	}
	
	public long getPop() {
		return lo1;
	}
	
	public void setCity(String s2) {
		this.s2 = s2;
	}
	
	public String getCity() {
		return s2;
	}
	
	public void setProgram(boolean b1) {
		this.b1 = b1;
	}
	
	public boolean getProgram() {
		return b1;
	}
	
	public void setStudent(boolean b2) {
		this.b2 = b2;
	}
	
	public boolean getStudent() {
		return b2;
	}
	
	
	public void setChar(char l1) {
		this.l1 = l1;
	}
	
	public char getChar() {
		return l1;
	}
	
	public void setAge(int i1) {
		this.i1 = i1;
	}
	
	public int getAge() {
		return i1;
	}
	
	public void setHeight(double d1) {
		this.d1 = d1;
	}
	
	public double getHeight() {
		return d1;
	}
	
	public void setRadius(double d2) {
		this.d2 = d2;
	}
	
	public double getRadius() {
		return d2;
	}
	
	public void setTemps(double d3) {
		this.d3 = d3;
	}
	
	public double getTemps() {
		return this.d3;
	}
	
	public double areaOfCircle() {
		result = Math.pow((PI * d2), 2);
		return result;
	}
	
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
	
	public void display() {
		
		System.out.flush();
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