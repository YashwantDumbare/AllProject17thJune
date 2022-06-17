package javapractice;

public class MultidimensionalArray {

	public static void main(String[] args) {
		int [][] array= {{1,2,3,4,5},{6,7,8,9,10}};
		for(int rows=0;rows<array.length;rows++) {
			for(int col=0;col<array[0].length;col++) {
				System.out.println(array[rows][col]);
			}
			
		}
		
	}

}
