package interview_programs;

public class FindTheAdjacentOccurenceOfCharactersInGivenString_3 {
	public static void main(String[] args) {
//		String s = "aabAaacggg";				// o/p :a2b1A1a2c1g3
		String s = "aabAaacg";				// o/p :a2b1A1a2c1g1
		boolean isFound = false;
		char[] arr = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		int count =1;
		for(int i=1; i<arr.length; i++) {
			char first = arr[i-1];
			char second = arr[i];
			
			if(first == second) {
				count++;
			}else {											// logic for appending the character and count 
				sb.append(first+""+count);
				count=1;
			}
			
			if(i==arr.length-1) {							// logic for appending the last character and count  
				sb.append(second+""+count);
			}
			
			if(!isFound && (first>='A' && first<='Z')) {   // to find index of first upper case letter 
				System.out.println("The index of first Upper Case Letter is : "+ (i-1));
			}
		}
		System.out.println(sb);  // sb is an object type
		System.out.println(sb.toString()); // sb obj to string
	}
}
