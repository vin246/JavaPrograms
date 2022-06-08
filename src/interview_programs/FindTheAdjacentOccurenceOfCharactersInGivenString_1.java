package interview_programs;

public class FindTheAdjacentOccurenceOfCharactersInGivenString_1 {
	public static void main(String[] args) {
		String s ="aabAaacg";  		//	o/p: a2b1A1a2c1g1
		char[] arr = s.toCharArray();
		String op="";
		char ch= arr[0];
		int count =1;
		for (int i=1; i<arr.length;i++) {
			if(ch==arr[i]) {
				count++;
			}else {
				op = op +ch+count;
				ch = arr[i];
				count =1;
			}

			if(arr[i]>='A' && arr[i]<='Z') {
				System.out.println(arr[i] + " is at index position: "+i);
			}
		}
		op = op+arr[arr.length-1]+count;
		System.out.println("The resultant output is "+op);
	}
}
