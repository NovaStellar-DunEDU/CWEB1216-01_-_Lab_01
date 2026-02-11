package testlab01;

public class colorStorage extends mainProgram{
	
	private String c1; // the User Input itself
	private static String s3, s2; // Final Variable Color Name, STORED User Inputed Color Name used for Output
	private boolean colorUpdate = true; // Checks if the colors have truly updated or not
	
    public static final String RESET = "\033[0m";  // Text Font and Color Reset
	
    // In Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE
    
	public void setColor(String s3) {
		this.s3 = s3;
	}
	
	public static String getColor() {
		return s3;
	}
    
	public void setColorName(String s2) {
		this.s2 = s2;
	}
	
	public static String getColorName() {
		return s2;
	}
	
    public void inputColor(String c1) {
    	switch(c1) {
    	case "Black", "black":
    		setColorName("Black");
    		setColor(BLACK_BOLD);
    		System.out.println(BLACK_BOLD + "This is the new color of your text." + RESET);
    		colorUpdate = false;
    		break;
    		
    	case "Red", "red":
    		setColorName("Red");
    		setColor(RED_BOLD);
    		System.out.println(RED_BOLD + "This is the new color of your text." + RESET);
    		colorUpdate = false;
    		break;
    		
    	case "Green", "green":
    		setColorName("Green");
    		setColor(GREEN_BOLD);
    		System.out.println(GREEN_BOLD + "This is the new color of your text." + RESET);
    		colorUpdate = false;
    		break;
    		
    	case "Blue", "blue":
    		setColorName("Blue");
    		setColor(BLUE_BOLD);
    		System.out.println(BLUE_BOLD + "This is the new color of your text." + RESET);
    		colorUpdate = false;
    		break;
    		
    	case "Purple", "purple":
    		setColorName("Purple");
    		setColor(PURPLE_BOLD);
    		System.out.println(PURPLE_BOLD + "This is the new color of your text." + RESET);
    		colorUpdate = false;
    		break;
    		
    	case "Cyan", "cyan":
    		setColorName("Cyan");
    		setColor(CYAN_BOLD);
    		System.out.println(CYAN_BOLD + "This is the new color of your text." + RESET);
    		colorUpdate = false;
    		break;
    		
    	case "White", "white":
    		setColorName("White");
    		setColor(WHITE_BOLD);
    		System.out.println(WHITE_BOLD + "This is the new color of your text." + RESET);
    		colorUpdate = false;
    		break;
    		
    	default:
    		setColorName("None");
    		System.out.println("Invalid Input. Try again.");
    		colorUpdate = true;
    	}
    }
}