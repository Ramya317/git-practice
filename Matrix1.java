import java.util.*;
import java.util.Arrays;

class Matrix1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("enter rows");
		int r=sc.nextInt();
		System.out.println("enter rows");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("enter values");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
		
				a[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<r;i++)
		
		System.out.println(Arrays.toString(a[i]));
	}
	
}