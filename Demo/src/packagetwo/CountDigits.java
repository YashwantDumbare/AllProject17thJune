package packagetwo;

public class CountDigits {

	public static void main(String[] args) {
		System.out.println(CountDigits.revNum(154698));
		int num=12345,rem,sum=0,count=0;
		while(num!=0) {
			rem=num%10;
			num=num/10;
			count++;			
		}
		System.out.println(count);

	}
	public static int revNum(int num) {
		int rev=0,rem;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}

}
