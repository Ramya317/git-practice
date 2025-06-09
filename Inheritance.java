class Human
{
	public void human1(String name,int weight)
	{
		System.out.println(name);
		System.out.println(weight);
		
		
	}
}
class Student extends Human
{
		public void human2(int marks,int rollNo)
		{
			System.out.println(marks);
			System.out.println(rollNo);
		}
	
}
class Inheritance
{
	public static void main(String args[])
	{
		Student obj1=new Student();
		obj1.human2(32,38);
		obj1.human1("ra",38);
	}
}