package set1;

public class CheckWhetherTheNumberIsPrimeOrNot {
	public static void main(String[] args) {
		int num =23;
		int count = 0;
		for (int i=2; i<num/2; i++) {
			if(num%i==0) {
				count++;
			}
		}
		//		System.out.println(count);
		if(count==0) {
			System.out.println("The given number "+num+" is a prime number");
		}else {
			System.out.println("The given number "+num+" is not a prime number");
		}
	}
}
