package set2;
//Reverse a Sring without a third variable
public class ReverseTheCharactersInGivenString {
	public static void main(String[] args) {
		String str = "DeepakSir";
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
