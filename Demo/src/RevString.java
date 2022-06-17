
public class RevString {

	public static void main(String[] args) {
		String str="Pooja";
		String Rev="";
		for(int i=(str.length()-1);i>=0;i--){
		System.out.println(str.charAt(i));
			Rev=Rev+str.charAt(i);
		}
		System.out.println(Rev);
	System.out.println("#################################");
	int k=12345;
	int rev=0,rem;
	while(k!=0) {
		rem=k%10;
		rev=rev*10+rem;
		k=k/10;
	}
	System.out.println(rev);

	}

}
