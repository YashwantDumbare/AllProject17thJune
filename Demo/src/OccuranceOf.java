
public class OccuranceOf {

	public static void main(String[] args) {
		String s1 = "My name is Shivaji";
		String s2= s1.replaceAll("\\s","");
		String s3 = s2.toLowerCase();
		int []freq = new int [s3.length()];
		char []string = s3.toCharArray();
		
		for (int i=0;i<s3.length();i++) {
			 freq[i]=1; 
			for (int j=i+1;j<s3.length();j++) {
				if(string[i]==string[j]) {
					freq[i]++;
					
					string[j]='0';
				}
			}
		}
		for (int i =0;i<freq.length;i++) {
			if (string[i]!='0') {
				System.out.println (string[i]+"= "+freq[i]);
			}
	}

}
	}
