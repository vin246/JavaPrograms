package interview_programs;

public class FindTheAdjacentOccurenceOfCharactersInGivenString_2 {
	public static void main(String[] args) {
		String s1 ="aabAaacg";  		//	o/p: a2b1A1a2c1g1
		char arr [] = s1.toCharArray();
		String op ="";
		for(int i=0; i<arr.length;) {
			char ch =arr[i];
			int count =1;
			for(int j=i+1; j<arr.length;j++) {
				if(ch==arr[j]) {
					count++;
				}
				else {
					break;
				}
			}
			op = op+ch+count;
			i=i+count;
		}
		System.out.println("The output is :"+op);
	}
}
