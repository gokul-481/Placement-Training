public class Palindrome_StringBuffer{
	public static void main(String[] args) {
	    String s="MALAYALAM";
		StringBuffer s1=new StringBuffer(s);
		StringBuffer revStr=s1.reverse();
		System.out.print(revStr);
		if(s.equals(revStr.toString())){
		    System.out.println(": It is a Palindrome");
		}
		else{
		    System.out.println(": It is not an Palindrome");
		}
	}
}