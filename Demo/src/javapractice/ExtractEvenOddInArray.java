package javapractice;

public class ExtractEvenOddInArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,9};
		System.out.println("Even num in array");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("Odd num in array");
		for(int value:arr) {
			if(value%2!=0)
			System.out.print(value+" ");
		}

	}

}
