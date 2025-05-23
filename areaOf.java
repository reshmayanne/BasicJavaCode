package JavaPractise;

import java.util.Scanner;

public class areaOf {
	
	
	double pi=3.14;
	public void CircleArea()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rediuos");
	int input=sc.nextInt();
	double circlearea=	input*pi*input;
	System.out.println("Area of circle is "+ circlearea);
		
	}
	public void TringleArea()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lenth and breadth");
	int lenth=sc.nextInt();
	int breath=sc.nextInt();
	double area=lenth*breath*0.5;
	System.out.println("Area of triangle is "+ area);
		
	}
	
	public void RectangleArea()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lenth and breadth");
	int lenth=sc.nextInt();
	int breath=sc.nextInt();
	int area=lenth*breath;
	System.out.println("Area of Rectangle is "+ area);
		
	}
	public void TrinangleCircumferaance()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lenth and breadth");
	int lenth=sc.nextInt();
	int breath=sc.nextInt();
	int area=lenth+breath;
	System.out.println("Circumferrance of triangle is "+ area);
	}
	
	public void RectangleCircumferaance()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lenth and breadth");
	int lenth=sc.nextInt();
	int breath=sc.nextInt();
	double area=2*(lenth+breath);
	System.out.println("Circumferrance of triangle is "+ area);
	}
	
	public void CircleCircumferrance()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rediuos");
	int input=sc.nextInt();
	double circlearea=	input*pi*2;
	System.out.println("Circumferrance of circle is "+ circlearea);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		areaOf a=new areaOf();
		a.CircleArea();
		a.TringleArea();
		a.RectangleArea();
		a.CircleCircumferrance();
		a.TrinangleCircumferaance();
		a.RectangleCircumferaance();

	}

}
