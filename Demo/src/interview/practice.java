package interview;

public class practice {
	public static void main(String[] args) {
		int num = 123454321;
		int rem;
		int rev = 0;
		int orgnum=num;
		int count = 0;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
			count++;

		}System.out.println(count);
		System.out.println(rev);
		if(orgnum==rev) {
			System.out.println("num is palindrome: "+orgnum);
		
		}else {
			System.out.println("num is not palindrome");
		}
		
		
	}
}
