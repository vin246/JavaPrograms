package arrayPrograms;

public class FindTheStringValueWhichIsHavingMaximumLengthInTheGivenStringArray {
	public static void main(String[] args) {
		String[] str = {"abc", "hi", "mango", "j", "tyss", "abcde"};
		String max = str[0];
		for(int i=1; i<str.length ; i++) {
			if(max.length() < str[i].length()) {
				max = str[i];
			}	
		}
		// to print the elemnts having maximum length in the array
		for(int i=0; i<str.length ; i++) {
			if(max.length() == str[i].length()) {
				System.out.println(str[i]);
			}
		}
	}
}