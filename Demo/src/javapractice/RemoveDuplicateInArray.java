package javapractice;

public class RemoveDuplicateInArray {

	public static void main(String[] args) {
		String arr[] = { "yashwant", "pooja", "shahu","pooja" };
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate element: " + arr[i]);
					flag = true;
				}

			}

		}

		if (flag == false) {
			System.out.println("No Duplicate element");
		}
	}

}
