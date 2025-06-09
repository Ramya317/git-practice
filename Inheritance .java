class Inheritance 
{
	public void human(String name,int weight)
	{
		System.out.println(name);
		System.out.println(weight);
		
		
	}
	public void student extends Humman(int marks,rollNo)
	{
		System.out.println(marks);
		System.out.println(rollNo);
	}
	public static void main(String args[])
	{
		Inheritance obj=new Inheritance();
		obj.human(" ram",34);
		obj.student(32,38);
	}
}