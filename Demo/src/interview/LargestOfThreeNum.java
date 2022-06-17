package interview;

public class LargestOfThreeNum {

	public static void main(String[] args) {
			int a=10,b=20,c=30;
			int largest;
			largest=a>b?a:b;
			largest=largest>c?largest:c;
			System.out.println(largest);
	}

}
