package javapractice;

public class ReverseEachWordString {
	public static void main(String[] args) {
		String str="Welcome to Goa Singham";
		String [] arr=str.split(" ");
		String revstring="";
		for(String word: arr) {
			String revword="";
			for(int i=word.length()-1;i>=0;i--) {
				revword=revword+word.charAt(i);
			}revstring=revstring+revword+" ";
		}	System.out.println(revstring);
	}

}
