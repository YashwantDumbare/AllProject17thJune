package packageone;

public class PrimeNumbers {

	public static void main(String[] args) {
		int num=7;
		int i;
		int count=0;
		for(i=1;i<=num;i++) {
		if(num%i==0) {
			count++;
			if(count==2)
				System.out.println(num+"num is prime");}
		}
	}

}
