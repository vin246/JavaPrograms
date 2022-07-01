package interview_programs;

public class PrintMissingNumbersInAGivenArrayProgram2 {
	public static void main(String[] args) {
		int arr[] = {2,7,10};
		int n= arr.length;

		for(int i=arr[0]; i<arr[n-1];i++) {
			boolean flag = false;
			for(int j=0; j<n;j++) {
				if(i==arr[j])
					flag=true;
			}
			if(flag==false)
				System.out.print(i+" ");
		}
	}
}
