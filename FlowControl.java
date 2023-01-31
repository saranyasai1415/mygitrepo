
public class FlowControl {
	public static void main(String args[]) {
		
		int a=1,b=10,c =20;
		
		if(a>=b && a>=c) {
			System.out.println("largest of 3 numbers is a :"+a);
		}
		if(b>=a && b>=c) {
			System.out.println("largest of 3 numbers is b :"+b);
		}
		if(c>=a && c>=b) {
			System.out.println("largest of 3 numbers is c :"+c);
		}
	}

}
