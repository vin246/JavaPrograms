package set3;

import java.util.LinkedHashSet;

//Remove The Duplicate Occurence Of Characters InAGivenString
// INDIA ---> INDA
public class RemoveTheDuplicateOccurenceOfCharactersInAGivenString {
	public static void main(String[] args) {
		String str = "malayalam";

		LinkedHashSet<Character>  set = new LinkedHashSet<Character>();
		for(int i=0; i<str.length(); i++) {
			set.add(str.charAt(i));
		}

		for(Character ch :set) {
			System.out.print(ch);
		}
	}
}
