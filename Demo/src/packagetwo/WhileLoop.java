package packagetwo;

public class WhileLoop {

	public static void main(String[] args) {
		WhileLoop r1= new WhileLoop();
		r1.checkNum(14);
		getReverse();
		System.out.println(getReverse(789456));
		for(int m=10;m>0;m--) {
			System.out.println(m);
		}
		}
		/*int i=1;
		while(i<10) {
			if(i%2==0) {
			System.out.println(i);}
			if(i%2==1)
				System.out.println("num is odd"+i);
			i++;}*/
	
	public int checkNum(int a) {
				if (a%2==0) {
				System.out.println(a);
			}else System.out.println("odd");
			
		
		return a;
	}
	public static void getReverse() {
		int num=4569, rev=0,rem=0;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}System.out.println(rev);
	
	}
	public static int getReverse(int p) {
		int rev=0,rem;
		while(p!=0) {
			rem=p%10;
			rev=rev*10+rem;
			p=p/10;
		}
		return rev;
	}
}
