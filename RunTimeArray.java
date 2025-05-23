package JavaPractise;

import java.util.Arrays;
import java.util.Scanner;

public class RunTimeArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		
		int[] array=new int[sc.nextInt()];
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println("Enter array Element at index position at->" +i);
			array[i]=sc.nextInt();
		}
		System.out.println("Array elements are " + Arrays.toString(array));
	}

}
