package arrayPrograms;

public class FindTheStringValueWhichIsHavingMinimumLengthInTheGivenStringArray {
	public static void main(String[] args) {
		String[] str = {"abc", "hi", "mango", "j", "tyss", "abcde", "i", "l"};
		String min = str[0];
		for(int i=1; i<str.length ; i++) {
			if(min.length() > str[i].length()) {
				min = str[i];
			}	
		}
		// to print the elemnts having minimum length in the array
		for(int i=0; i<str.length ; i++) {
			if(min.length() == str[i].length()) {
				System.out.println(str[i]);
			}
		}
	}
}
