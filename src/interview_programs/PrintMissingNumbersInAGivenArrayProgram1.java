package interview_programs;

public class PrintMissingNumbersInAGivenArrayProgram1 {
	public static void main(String[] args) {
		int num1, num2;
		int arr[] = {2,7,10};
		for(int i=0; i<arr.length-1;i++) {
			num1 = arr[i];
			num2 = arr[i+1];
			for(int j=num1+1; j<num2; j++) {
				System.out.print(j+" ");
			}
		}
	}
}
