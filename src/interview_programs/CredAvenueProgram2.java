package interview_programs;

public class CredAvenueProgram2 {
	public static void main(String[] args) {
		String s ="Vinay";		//mOhA MmEd
		String str = s.toLowerCase();  // i/p:Vinayd  o/p:vInaYd
		for (int i=0; i<str.length()/2;i++) {
			if(i%2==0) {
				System.out.print(str.charAt(i));
			}else {
				String temp =""+str.charAt(i);
				System.out.print(temp.toUpperCase());
			}
		}

		for (int i=str.length()/2; i<str.length();i++) {
			if(i%2!=0) {
				System.out.print(str.charAt(i));
			}else {
				String temp =""+str.charAt(i);
				System.out.print(temp.toUpperCase());
			}
		}
	}
}
