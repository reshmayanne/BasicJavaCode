package JavaPractise;

import java.util.Scanner;

interface parent
{
	void add();
	void sub();
}
 class InterF implements parent{
	

	void mul()
	{
		
			int x;
			int y;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the values");
			x=sc.nextInt();
			y=sc.nextInt();
			int z=x*y;
			System.out.println("Multification  of numb "+ z);
		}
	


	@Override
	public void add() {
		int x;
		int y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		x=sc.nextInt();
		y=sc.nextInt();
		int z=x-y;
		System.out.println("Substraction of numb "+ z);	
	}

	@Override
	public void sub() {
		
			int x;
			int y;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the values");
			x=sc.nextInt();
			y=sc.nextInt();
			int z=x+y;
			System.out.println("Addition of numb "+ z);
		
	}

}
