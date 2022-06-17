package day11Operators;

public class UnaryOp3 {

	public static void main(String[] args) {
		int a = 0, b;
		b = a++ + ++a + ++a + a; //0+2+3+3

		System.out.println("a: "+a);// 0
		System.out.println("b: "+b);//8
		System.out.println("**********************");
		a = -7;
		b = a-- + --a + --a + a;  //(-7)+(-9)+(-10)+(-10)=(-36)
		System.out.println("a: "+a);//-10
		System.out.println("b: "+b);// -36

		a = 21;
		b = --a + --a + --a + a + ++a + a++;//20 19 18 18 19 19 a=20
		System.out.println(a);//
		System.out.println(b);// 


		a = -9;
		b = a-- + a + ++a + a++ + ++a + a++ + a;// (-9)+(-10)+(-9)+(-9)+(-7)+(-7)+(-6)
		System.out.println(a);//-6
		System.out.println(b);//-57
		}
}
