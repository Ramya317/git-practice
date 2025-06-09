import java.util.*;
class Panagram
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String ");
		String s=sc.nextLine();
		boolean [] alphabet=new boolean[26];
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='A' && c<='Z')
			{
				alphabet[c-'A']=true;
			}
			else if(c>='a' && c<='z')
			
			{
				alphabet[c-'a']=true;
			}
			
		}
		boolean ispanagram=true;
		for(boolean present:alphabet)
		{
			if(!present)
			{
				ispanagram= false;
				break;
			}
		
		}
		if(ispanagram)
		{
			System.out.println(" panagram");
		}
		else
		{
			System.out.println("not  panagram");
		}

		
	}	
}