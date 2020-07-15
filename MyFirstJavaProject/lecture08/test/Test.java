package test;

public class Test {
	
	public static void main(String[] args) {
		
		int dayOfWeek = 1;
		String day = "Saturday";
		
        // variable you use for switch (in this case dayOfWeek) can be of type:
        // - byte, short, char, and int (primitive data types);
        // - String
        // - enumerated types (to be covered later)
        // - certain wrapper classes: Character, Byte, Short, and Integer
		switch(dayOfWeek) {
			//body of switch 
			case 1:
				day = "Monday";
				break;
			case 5:
				day = "Friday";
				break;
			default:
				day = "";
				break;
		}
		int i;
		day = "Friday";
		
		switch(day) {
		case "Monday":
			i = 1;
			break;
		case "Wednesday":
			i = 3;
			break;
		default:
			i = 5;
			break;
		}
		
		System.out.println(i + ": " + day);
		
		
	}
	
	

}
