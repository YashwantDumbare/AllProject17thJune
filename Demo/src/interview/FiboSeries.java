package interview;

public class FiboSeries {
	public static void main(String [] args) {
		int n1=0;
		int n2=1;
		int sum=0;
		for(int i=1;i<9;i++) {
			
			sum=n1+n2;
			System.out.print(sum+" ");
			n1=n2;
			n2=sum;
		}
		
		
		
	}

}
