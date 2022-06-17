package packagetwo;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println(getLeapYear(2028));
	/*	int year=2000;
		if ( (year%4==0) && (year%100!=0) || (year%400==0) ) {
			System.out.println("Leap year "+year);
		}
		else {
			System.out.println("Not Leap Year");
		}*/
			

	}
	static boolean getLeapYear(int year){
		if((year%4==0)&&(year%100!=100)||(year%400==0)) {
			return true;
		}
	
		else{return false;}
		
	}

}
