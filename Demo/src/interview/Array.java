package interview;

public class Array {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,3,5};
		for(int a:array) {
			System.out.println(a);
		}
		System.out.println("**************************");
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		System.out.println("**************************");
		
		boolean flag=false;
		for(int j=0;j<array.length;j++) {
			for(int k=j+1;k<array.length;k++) {
				if(array[j]==array[k]) {
					System.out.println("duplicate found at: "+k+" and duplicate is "+array[j]);
					flag=true;
					
				}
			}
		}if (flag==false) {System.out.println("duplicate not found");}
	}
		

}
