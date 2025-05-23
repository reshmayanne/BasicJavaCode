package JavaPractise;

import java.util.Scanner;

public class StaticMethod {
	 int res;
	public static void ass()
	{
		int a = 0,b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		StaticMethod sm=new StaticMethod();
		 a=sc.nextInt();
		b=sc.nextInt();
		sm.res=a%b;
		if(sm.res==0)
		{
		System.out.println("Even no having reminder as " + sm.res);
		
	}
		else
		{
			System.out.println("odd no having reminder as " +  sm.res);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod.ass();

		

	}

}
