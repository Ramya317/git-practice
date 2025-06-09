class Human
{
	public void human1(int height,int weight)
	{
		System.out.println(height);
		System.out.println(weight);
		
		
	}
}
class Student extends Human
{
		public void human1(int marks,int rollNo)
		{
			System.out.println(marks);
			System.out.println(rollNo);
		}
	
}
class Polymarphism
{
	public static void main(String args[])
	{
		Student obj1=new Student();
		obj1.human1(32,38);
		obj1.human1(23,38);
	}
}