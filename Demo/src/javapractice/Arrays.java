package javapractice;

public class Arrays {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6};
		int [] b= {7,8,9,10};
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
			
		}
		System.out.println("****************************");
		b=array.clone();
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		
	}

}
}
