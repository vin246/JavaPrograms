package set1;

//Generate First 5 Fibonacci Numbers 
public class GenerateFirst5FibonacciNumbers {
	public static void main(String[] args) {
		int fib1 = 0;
		int fib2 = 1;
		int num =5;
		if(num==1) {
			System.out.println(fib1);
		}else {
			System.out.print(fib1+" "+fib2+" ");
			for(int i=2; i<num; i++) {
				int fib3 = fib1+ fib2;
				fib1 = fib2;
				fib2 = fib3;
				System.out.print(fib3+" ");	
			}
		}
	}
}
