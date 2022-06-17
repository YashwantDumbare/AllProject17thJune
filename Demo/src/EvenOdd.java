
public class EvenOdd {
	
	public static void evenOdd(int num) {
		
		if (num%2==0)
			System.out.println("num is even "+num);
		else 
			System.out.println("num is odd "+num);
		}
	
	public double getInterest(int p, int r, int t) {
		double res=(p*r*t)/100;
				return res;
	}
	public static void main(String[] args) {
		evenOdd(20);
		System.out.println("even num");
		for (int i=1;i<=10;i++) {
			if (i%2==0)
				System.out.println(i);
		}
		int num1=20;
		int num2=30;
		int res = num1+num2;
		System.out.println(res);
		EvenOdd m1= new EvenOdd();
		System.out.println(m1.getInterest(1000,8,5)*10);
	}

}
