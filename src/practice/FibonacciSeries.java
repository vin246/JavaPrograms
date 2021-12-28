package practice;

public class FibonacciSeries {
public static void main(String[] args) {
	int num1=0;
	int num2=1;
	int num=5;
	
	if(num==1) {
		System.out.println(num1);
	}else if(num==2) {
		System.out.println(num1+" "+num2);
	}else {
		System.out.print(num1+" "+num2);
		for(int i=1; i<num-1; i++) {
			int num3 = num1 + num2;
			System.out.print(" "+num3+" ");
			num1=num2;
			num2=num3;
		}
	}
}
}
