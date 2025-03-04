public class Palindrome_String{
	public static void main(String[] args) {
		String s="1A?AYA?A1",temp="";
		int i=s.length()-1;
		while(i>=0){
		    temp=temp+s.charAt(i);
		    i--;
		}
		System.out.print(temp);
		if(s.equals(temp)){
		    System.out.println(": It is a Palindrome");
		}
		else{
		    System.out.println(": It is not a Palindrome");
		}
	}
}