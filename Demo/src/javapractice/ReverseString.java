package javapractice;

public class ReverseString {
	public static void main(String[]args){
		String str="Shahu";
		String str1="anand";
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.toLowerCase());
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		StringBuffer sb =new StringBuffer(str);
		System.out.println(sb.reverse());
		
	}
	
}
