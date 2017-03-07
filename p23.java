class p19
{
	public static void main(String[] ar)
	{
		String s1="Hello";
		String s2=new String("Hello");
		String s3=new String("Hello");
		String s4="Hello";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s2==s3);
		System.out.println(s2==s4);
		System.out.println(s3==s4);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}