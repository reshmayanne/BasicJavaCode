package JavaPractise;

import java.util.Scanner;

public class RevereseString {
	static String str="";
	
static String input="";
	 public void reverse() {
		 
		  Scanner s=new Scanner(System.in);
			System.out.println("Enter the string to reverse");
		 input=s.nextLine();
//		String str="";
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter the string to reverse");
//	String input=s.nextLine();
		 
	for(int i=0;i<input.length();i++)
	{
		 str=input.charAt(i)+str;
	}
	System.out.println(str);
	if(str.equalsIgnoreCase(input))
	{
		System.out.println("String is palindrom");
	}
	else
	{
		System.out.println("String is not palindrom");
	}
		
StringBuilder sb=new StringBuilder("cybage");
String rev=sb.reverse().toString();
System.out.println(rev);

StringBuffer sbr=new StringBuffer("open");
String rev1=sbr.reverse().toString();
System.out.println(rev1);


				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RevereseString rb=new RevereseString();
		rb.reverse();
		
		
	}

}
