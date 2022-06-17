package interview;

public class Factorial {

	public static void main(String[] args) {
		int num = 5;
		long factorial =1;
		for(int i=1;i<=5;i++) {
			factorial=factorial*i;
		}
			System.out.println(factorial);
			System.out.println("**********************************");	
			int num1=12345;
			int sum=0;
			while(num1!=0) {
				int rem=num1%10;
				sum=sum+rem;
				num1=num1/10;
		
			}
			System.out.println(sum);
	
	}

}
