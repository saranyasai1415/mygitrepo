
public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month = Integer.parseInt(args[0]);
		String s ="";
		switch(month) {
		case 1:
		case 2:
			s = "winter";
			break;
			
		case 3:
		case 4:
			s = "summer";
			break;
		case 5:
		case 7:
		case 6:
			s = "spring";
			break;
		default:
			s = "invalid month";
			
			
	}
	System.out.println("season is " +s);	
	}

}
