package JavaPractise;

import java.util.ArrayList;

public class CollectionPractise {

	public static void main(String[] args) {
	
	ArrayList al=new ArrayList();
al.add("String");
al.add("Integer");
al.add("char");
al.add("boolean");
al.add("****");
al.add("4.50");al.add("123");
System.out.println(al);

//al.add(0, "45");
//System.out.println(al);
//al.addLast("last");
//System.out.println(al);
//al.addFirst("first");
//System.out.println(al);
//
ArrayList a2=new ArrayList();

a2.add("String");
a2.add("Integer");
a2.add("char");
a2.add("boolean");
a2.add("****");
a2.add("4.50");a2.add("123");
System.out.println(a2);
boolean t=a2.containsAll(al);
System.out.println(t);
a2.ensureCapacity(0);
System.out.println(a2.isEmpty());
System.out.println(a2.removeAll(al));
a2.ensureCapacity(0);
System.out.println(a2);
System.out.println(al.getFirst());

	}

}
