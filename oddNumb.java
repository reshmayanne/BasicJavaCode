package JavaPractise;

import java.util.Scanner;

public class oddNumb {

	int odd=0;
	public void oddnumfind()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		for(int i=0;i<=5;i++)
		{
	 odd=sc.nextInt();
		
		if(!((odd%2)==0))
		{
			System.out.println("These are odd numbers");
			continue;
		}
		else
		{
			System.out.println("These are not odd number");
		}
		}
	}
	public static void main(String[] args) {
		oddNumb od=new oddNumb();
		od.oddnumfind();

	}

}
