package packagetwo;

public class TotalRecallConcepts {
    static int a=25;
    static int b=15;
    int c=18;
    final double pi=3.14;
    
	public static void main(String[] args) {
    int addition = a+b;
    int sub= TotalRecallConcepts.a-TotalRecallConcepts.b;
    System.out.println("Substraction:"+sub);
    TotalRecallConcepts object= new TotalRecallConcepts();
    
    int result=addition+object.c;
    System.out.println("Result of static and non static variable adiition: "+result);
    
    TotalRecallConcepts.square(5);
    System.out.println("Square of float number:"+object.square(5.5f));
    
    int a=10;
    int c=20;
    int multi=a*c*object.c;
    System.out.println("multiplication :"+multi);
	}
	
	static public void square(int number) {
		int res = number * number;
		System.out.println("sqare of int number:"+res);
	}
	public double square(float number ) {
		double res= number*number;
		return res;
		
		
	} 

	}