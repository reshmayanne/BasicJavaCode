package JavaPractise;

public class thisKeyword {

	int empid;
	double salary;
	String name;
	
	public void empProfile(int id,double sal,String nam)
	{
		this.empid=id;
		this.salary=sal;
		this.name=nam;
		
	}
	public static void main(String[] args) {
		
		thisKeyword ed=new thisKeyword();
		ed.empProfile(21, 98888, "cyb");
		System.out.println(ed.empid);
		System.out.println(ed.salary);
		System.out.println(ed.name);
	}

}
