package set2;

public class ReverseAStringWithThirdVariable {
	public static void main(String[] args) {
		String str = "DeepakSir";
		String rev = "";
		//logic for store the characters in reverse order in third variable
		for(int i=str.length()-1; i>=0; i--) {
			rev=rev + str.charAt(i);
		}
		System.out.println("The reverse of a given String "+str+" is :"+rev);
	}
}
