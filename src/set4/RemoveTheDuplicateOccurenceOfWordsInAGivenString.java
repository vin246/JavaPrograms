package set4;

import java.util.LinkedHashSet;

public class RemoveTheDuplicateOccurenceOfWordsInAGivenString {
	public static void main(String[] args) {
		String s = "Hii Hello Hii";
		String[] str = s.split(" ");
		LinkedHashSet<String>  set = new LinkedHashSet<String>();
		for(int i=0; i<str.length; i++) {
			set.add(str[i]);
		}

		for( String word :set) {
			System.out.print(word+" ");
		}
	}
}