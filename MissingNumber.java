
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {1,2,4,5};
		int n=5;
		int sumOfAll = (n*(n+1))/2; 
		int sumOfArray = 0;
		for(int i=0;i<=n-2;i++) {
			sumOfArray = sumOfArray+num[i];
		}
		int missingNumber = sumOfAll - sumOfArray;
		System.out.println("missing number : "+missingNumber);
	}

}
