package set3;

import java.util.LinkedHashSet;
//Print Only The Unique Occurence Of Characters In A Given String
public class PrintOnlyTheUniqueOccurenceOfCharactersInAGivenString {
	public static void main(String[] args) {
		String str = "malayalam";

		LinkedHashSet<Character>  set = new LinkedHashSet<Character>();
		for(int i=0; i<str.length(); i++) {
			set.add(str.charAt(i));
		}

		for(Character ch :set) {
			int count=0;
			for(int i=0; i<str.length(); i++) {
				if(ch==str.charAt(i)) {
					count++;
				}		
			}
			if(count==1) {
				System.out.println(ch + "-->"+count);
			}
		}
	}
}
