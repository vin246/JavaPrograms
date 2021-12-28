package set5;

public class AllFirstLettersOfAWordToUpperCase {
	public static void main(String[] args) {
		String s = "welcome to testyantra";
		String[] str = s.split(" ");
		for(int i = 0 ; i< str.length; i++) {
			String temp = str[i];
			for(int j =0; j<temp.length(); j++) {
				if(j==0) {
					//				String s1 = ""+temp.charAt(j);
					//				System.out.print(s1.toUpperCase());
					char ch = (char) (temp.charAt(j)-32);
					System.out.print(ch);
				}else {
					System.out.print(temp.charAt(j));
				}
			}
			System.out.print(" ");
		}
	}
}
