public class Palindrome_StringBuilder{
	public static void main(String[] args) {
	    String s="MALAYALAM";
		StringBuilder s1=new StringBuilder(s);
		StringBuilder revStr=s1.reverse();
		System.out.print(revStr);
		if(s.equals(revStr.toString())){
		    System.out.println(": It is a Palindrome");
		}
		else{
		    System.out.println(": It is not an Palindrome");
		}
	}
}