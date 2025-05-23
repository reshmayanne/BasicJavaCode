package JavaPractise;

import java.util.Scanner;

public class abstarctandConcrete extends abs {    //concreat class
	
	
		public static void main(String[] args)
				{
			
		
			abstarctandConcrete ab=new abstarctandConcrete();
			ab.add();
			ab.sub();
		}
		void sub() //concreate methos
		{
			int x;
			int y;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the values");
			x=sc.nextInt();
			y=sc.nextInt();
			int z=x-y;
			System.out.println("Substraction of numb "+ z);	
		}
		@Override  //overriden abstact method
		void add() {
			
			{
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
}



 abstract class abs  // abstract class
{ 
	abstract void add(); //abstact method
	
	
}

