package interview;

public class Demo {

	public static void main(String[] args) {
		int rows = 5;
		int num=0;
		for (int i = 1; i < rows; i++) {
			for (int j =1; j <= i; j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();

		}

	}

}
