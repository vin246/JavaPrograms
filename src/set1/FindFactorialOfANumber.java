package set1;
//To Find Factorial Of A Given Number 
public class FindFactorialOfANumber {
	public static void main(String[] args) {
		int fact=1;  
		int number=5;
		for(int i=1;i<=number;i++){    
			fact=fact*i;    
		}    
		System.out.println("Factorial of a Given number "+number+" is: "+fact);    
	}
}