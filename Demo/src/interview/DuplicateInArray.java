package interview;

public class DuplicateInArray {
	public static void main(String[]args) {
		
		int[] arr= {1,2,3,4,5,6,1,2,3};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("duplicate elements are found at index "+i+", "+(j-1)+" and element is "+arr[j]);
				}
			}
		}
	}

}
