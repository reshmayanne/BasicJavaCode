package JavaPractise;

import java.util.Arrays;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		
		int[] array =new int[5];
		int i=0;
		
		System.out.println("Enter array elemet");
		Scanner sc=new Scanner(System.in);
		for( i=0;i<5;i++)
		{
			array[i]=sc.nextInt();
			
		}
		System.out.println("Array Eelments are "+ Arrays.toString(array));
		System.out.println("Array list are " +Arrays.asList(Arrays.toString(array)));
	}

}
