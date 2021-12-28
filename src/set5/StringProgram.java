package set5;

public class StringProgram {
	public static void main(String[] args) {
		String s = "abc" + "xyz";
		//	This logic will work only for the above input type
		for(int i =0; i<s.length()/2 ; i++) {
			String s1 = "" + s.charAt(i)+s.charAt(s.length()/2 + i);
			System.out.print(s1);
		}
	}
}
