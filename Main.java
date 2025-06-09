
class Human
{
	
	public void s(String name,int height)
	{
		
		System.out.println("name:"+name);
		System.out.println("height:"+height);
		
	}
		

	
}
class Student
{
	public void s1(String name,int rollNo)
	{
		System.out.println("name:"+name);
		System.out.println("rollNo:"+rollNo);
		
	}
		
	
}
class Main
{
	
	public static void main(String args[])
	{
		Human obj=new Human();
		obj.s("ravi",34);
		
		Student obj1=new Student();
		obj1.s1("ramya",8);

		
	}
}