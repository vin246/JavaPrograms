package practice;

public class PrimeOrNot {
	public static void main(String[] args) {
		int num = 5;
		int count=0;
		
		for(int i=1; i<num; i++) {
			
			if(num%i==0) {
				count++;
			}
		}
		if(count==1) {
			System.out.println("The number is prime");
		}
		else
		{
			System.out.println("The number is not a prime");
		}
	}
}
