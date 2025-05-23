package JavaPractise;

import java.util.HashMap;
import java.util.Map;

public class Collmap {

	public static void main(String[] args) {
		
		Map mp=new HashMap();
mp.put(1, "keyboard");
mp.put(2, "Mouse");
mp.put(3, "Monitor");
mp.put(4, "cpu");
mp.put(5, "keyboard");
mp.put(6, "Laptop");mp.put(7, "Memory");
System.out.println(mp);
mp.containsValue(5);
System.out.println(mp.containsKey(5));

System.out.println(mp.containsValue("cpu"));
	}

}
