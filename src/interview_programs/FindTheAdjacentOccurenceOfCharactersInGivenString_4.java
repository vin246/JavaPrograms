package interview_programs;

public class FindTheAdjacentOccurenceOfCharactersInGivenString_4 {
	public static void main(String[] args) {
		String str = "aabAaacg";
		String outstr = "";
		char[] ch = str.toCharArray();
		for (int i=0; i<ch.length; i++) {
			int count = 1;
			if(ch[i]=='o') {
				continue;
			}
			for(int j =i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='o';
				}
				else {
					break;
				}
			}
			System.out.print(ch[i]+ "" + count);
		}
	}
}