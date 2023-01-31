
public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month = Integer.parseInt(args[0]);
		System.out.println(month);
		if(month ==12 || month>=1 && month<=2) {
			System.out.println("winter");
		}
		else if(month>2 && month<=5) {
			System.out.println("summer");
		}
		else if(month>5 && month<=8) {
			System.out.println("spring");
		}
		else if(month>8 && month<=11) {
			System.out.println("spring autumn");
		}
	}

}
