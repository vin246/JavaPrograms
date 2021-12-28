package set1;

import java.util.Scanner;

//Generate Fibonacci Numbers Till A Given Value
public class GenerateFibonacciNumbersTillAGivenValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fib1 = 0;
		int fib2 = 1;
		int num = sc.nextInt();
		//int num =25;
		if(num==1) {
			System.out.println(fib1);
		}else {
			System.out.print(fib1+" "+fib2+" ");
			for(int i=2; i<num; i++) {
				int fib3 = fib1+ fib2;
				fib1 = fib2;
				fib2 = fib3;
				if(fib3>=num) {
					break;
				}
				System.out.print(fib3+" ");	
			}
		}
	}
}
