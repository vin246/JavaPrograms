package set5;
//Reverse Each Word In A Given String
public class ReverseEachWordInAGivenString {
	public static void main(String[] args) {
		String s= "welcome to testyantra";
		String[] str = s.split(" ");
		for(int i = str.length-1; i>=0; i--) {
			System.out.print(str[i]+" ");
		}
	}
}
