package JavaPractise;

import java.util.Scanner;

public class PalindromNumber {
	
	
	public static void main(String[] args)
	{
		PalindromNumber p=new PalindromNumber();
		p.pal();
		
	}
	
	
	void pal()
	{
	
System.out.println("Enter the numb");
	Scanner sc=new Scanner(System.in);
	int numb=sc.nextInt();
	int rev = 0,temp=0;
	while(!(numb==0))
	{
		temp=numb%10;
		rev=rev*10+temp;
		numb=numb/10;
		System.out.println(numb);
		System.out.println("Reverse numb is :" + rev);
		
	}	
	
				if(rev==sc.nextInt())
				{
					System.out.println("Number is palindrom");
				}
				else
				{
					System.out.println("Number is not palidrom");
				}			
	
	}
}

	