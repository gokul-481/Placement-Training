class Main
{
	public static void main(String s[])
	{
		int a=10;
		int b=23;
		int c=38;
		int max=(a>b)?a:b;
		System.out.println("TERNARY OPERATOR:");
		System.out.println(max);
		System.out.println("NESTED TERNARY OPERATOR:");
		int max1=(a>b && a>c)?a:(b>c)?b:c;
		System.out.println(max1);
	}
}