package arrayPrograms;

public class PrintAllTheElementsOfArrayInDescendingOrder {
	public static void main(String[] args) {
		int [] arr = {20,30,10,50,40};
		//swap the elements in Descending Order
		for(int i =0; i< arr.length; i++) {
			for(int j =i; j< arr.length ;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//to print the Array Elements
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
	}
}
