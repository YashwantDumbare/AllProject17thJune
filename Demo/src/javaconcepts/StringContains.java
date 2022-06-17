package javaconcepts;

public class StringContains {
		public static void main(String [] args) {
			String str="Suman Human";
			int total=str.length();
			int afterremove=str.replaceAll("u", "").length();
			int occuranceOfU=total-afterremove;
			System.out.println(occuranceOfU);
		}
}
