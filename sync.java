package JavaPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sync {


	public static void main(String[] args) {
		
		List<String> ls=new ArrayList<String>();
		List<String> synls=Collections.synchronizedList(ls);
		ls.add("before");
		synls.add("java");
		synls.add("HTML");
		synls.add("JAVASCRIPT");
		synls.add("PYTHON");
		ls.add("test");
		Collections.synchronizedCollection(ls);
		
		for(String s : synls)
		{
			System.out.println(s);
		}
	}

}
