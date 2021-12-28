package set1;
//Check Whether The Given Number Is Palindrome Or Not
public class CheckWhetherTheNumberIsPalindromeOrNot {
	public static void main(String[] args) {
		int num = 525;
		int temp = num;
		int sum = 0;
		//logic for palindrome
		while(num>0) {
			int digit = num%10;
			sum = sum*10 +  digit;
			num = num/10;
		}
		if(sum == temp) {
			System.out.println("The given number "+temp+" is a palindrome");
		}else {
			System.out.println("The given number "+temp+" is not a palindrome");
		}
	}
}
