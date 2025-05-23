package JavaPractise;

public class superCalling {
	
	superCalling() {
	
		System.out.println("first constructor");
	}
	
	superCalling(int x) {
		System.out.println("2nd constructor");
		
	}
	superCalling(int x, int y)
			{
		System.out.println("3rd constructor");
			}
	
public static void main(String[] args) {
	child c=new child();
	
		
	}
}
	
	  class child extends superCalling{
		child()
		{
		super(45,25);
		System.out.println("Calling from child class");
		
		}
		
		
		
	}
	
	

	

