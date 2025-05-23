package JavaPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoCollection {

	public static void main(String[] args) {
	
		List l1=new ArrayList();
		l1.add(122);              //add method
		l1.add("test");
		l1.add(50.63);
		l1.add("Automation");
		l1.add("2025");
		System.out.println("First list element " + l1);
		
		List l2=new ArrayList();
		l2.add("2nd list");
		l2.add("56");
		l2.addAll(l1);           //addAll method
		System.out.println("second list element"+ l2);
	
		l2.addAll(0, l1);
		System.out.println("New list" +l2);
	}

}
