package JavaPractise;

public class Animal2{

	public static void main(String[] args) {
		Dog d=new Dog();
	  d.eat();
	  d.eat1();
		
		
	}
	public  void eat1()
	{
		System.out.println("Eating anything");
	}
}

	 class Dog extends Animal2
	{
		public  void eat()
		{
			System.out.println("Eating Biscuits");
		}
		
	}


