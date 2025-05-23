package JavaPractise;

public class Animal3 {

	public static void main(String[] args) {
		
		dog d=new dog();
		d.eat();
		Cat c=new Cat();
		c.eat();
		
	}
}
class dog extends Animal3
{
	public  void eat()
	{
		System.out.println("eat biscuits");
	}
	
}
	class Cat extends Animal3
	{
		public  void eat()
		{
			System.out.println("eat rat");
		}
}

