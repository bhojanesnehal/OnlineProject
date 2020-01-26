package aa;

import java.util.TreeSet;

class Duplicate
{
	public static void main(String args[])
	{
		int intArr[]={1,3,5,7,4,6,5,7,3};
		TreeSet<Integer> unique=new TreeSet<Integer>();
		for(int iArr:intArr)
		{
			if(!unique.add(iArr))
				System.out.println("Duplicates Values are:" +iArr);
		}
		System.out.println(unique);
		
	}
}
	
