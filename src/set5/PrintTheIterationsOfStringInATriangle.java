package set5;

public class PrintTheIterationsOfStringInATriangle {
	public static void main(String[] args) {
		String s = "INDIA";
		String temp = "";
		for(int i = 0; i<s.length(); i++) {
			temp = temp + s.charAt(i);
			System.out.println(temp);
		}
	}

}