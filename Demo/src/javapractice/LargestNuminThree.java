package javapractice;

public class LargestNuminThree {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		int largest = a > b ? a : b;
		largest = c > largest ? c : largest;
		System.out.println(largest);
	}

}
