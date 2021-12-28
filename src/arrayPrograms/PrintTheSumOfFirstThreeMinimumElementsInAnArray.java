package arrayPrograms;

public class PrintTheSumOfFirstThreeMinimumElementsInAnArray {
public static void main(String[] args) {
	int [] arr = {20,30,10,50,40};
	int sum =0;
	//swap the elements in Ascending Order
	for(int i =0; i< arr.length; i++) {
		for(int j =i; j< arr.length; j++) {
			if(arr[i]>arr[j]) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}

	for(int i =0; i<3 ; i++) {
		sum = sum + arr[i];
	}
	System.out.println(sum);
}
}
