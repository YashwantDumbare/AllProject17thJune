package packagetwo;

import java.util.Scanner;

public class CountDigitsInNum {
//count--reverse--sum of digits
	public static void main(String[] args) {
		System.out.println("Enter a num");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int orgnum=num;
	int rem=0;
	int count=0;
	int sum=0;
	int rev=0;
	
	while(num!=0) {
		rem=num%10;
		rev=rev*10+rem;
		sum=sum+rem;
		num=num/10;
		
		count++;
	}
System.out.println(sum);
System.out.println(rev);
if(rev==orgnum) {
	System.out.println("num is palindrome");
}else System.out.println("num is not palindrome");
System.out.println(count);
	}

}
