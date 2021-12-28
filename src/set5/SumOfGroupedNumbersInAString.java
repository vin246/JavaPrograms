package set5;

public class SumOfGroupedNumbersInAString {
	public static void main(String[] args) {
		String s = "15ab10$25";
		int sum = 0;   //sum --> sum of grouped numbers (i.e, sum of consecutive numbers) in a String
		int tSum = 0; //tSum --> sum of  the grouped sum   (15 + 10 + 25)
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) >='0' && s.charAt(i) <= '9') {
				int n = s.charAt(i)-48;  //n --> It will  convert the number to integer
				sum = sum * 10 + n ;
			}else {
				tSum = tSum +sum;
				sum = 0;
			}	
		}
		tSum = tSum +sum;
		System.out.println(tSum);
	}
}
