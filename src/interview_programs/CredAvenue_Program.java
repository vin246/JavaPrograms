package interview_programs;

public class CredAvenue_Program {
	public static void main(String[] args) {
		String str = "Vinay";   //viNaY
		//str.toLowerCase();
		String ns = "";
		for(int i=0; i<str.length(); i++){
			if(i==0){
				String temp = ""+ str.charAt(i);
				ns = ns+temp.toLowerCase();
			}
			else if(i%2!=0){
				String temp = ""+ str.charAt(i);
				ns = ns+temp; 
			}
			else{
				String temp = ""+ str.charAt(i);
				ns = ns+temp.toUpperCase();
			}
		}
		System.out.println(ns);
	}
}