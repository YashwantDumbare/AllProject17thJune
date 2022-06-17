package javapractice;

public class CountDigits {
	public static void main(String[] args) {
		int a = 12345;
		int count = 0;
		int sum = 0;
		while (a != 0) {
			int rem = a % 10;
			sum = sum + rem;
			a = a / 10;
			count++;

		}
		System.out.println(count);
		System.out.println(sum);
	}
}
