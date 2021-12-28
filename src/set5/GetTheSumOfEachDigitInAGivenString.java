package set5;

public class GetTheSumOfEachDigitInAGivenString {
	public static void main(String[] args) {
		String s = "abc12de354";
		int sum = 0;
		for(int i=0;i<s.length(); i++) {
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				int num = s.charAt(i)-48;
				sum = sum + num ;
			}
		}
		System.out.println("The sum of digits in the given String "+ s + " is :" + sum);
	}
}
