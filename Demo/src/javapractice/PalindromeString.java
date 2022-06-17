package javapractice;

public class PalindromeString {

	public static void main(String[] args) {
		String str="Madam";
		String orgstr=str;
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
			if(orgstr.equalsIgnoreCase(rev)) {
				System.out.println("string is palindrome "+rev);
			}
		
	}

}
