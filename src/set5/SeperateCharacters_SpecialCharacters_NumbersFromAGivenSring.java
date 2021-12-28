package set5;

public class SeperateCharacters_SpecialCharacters_NumbersFromAGivenSring {
	public static void main(String[] args) {
		String s = "a442&$$#%(^())JHJHsaddjfklsdjfsk";
		String alp = "";
		String num = "";
		
		String spl = "";
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i) >= 'a' && s.charAt(i) <='z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				alp = alp + s.charAt(i);
			}else if(s.charAt(i) >='0' && s.charAt(i) <= '9') {
				num = num + s.charAt(i);
			}else {
				spl = spl + s.charAt(i);
			}
		}
		System.out.println("Characters : " + alp +" Special Characters:  "+ num + " Special Characters: "+spl);
	}
}
