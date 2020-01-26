package aa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Prime { 
	
	public static void main(String[] args)
	{
		int flag=0;
		int num;
		HashSet set=new HashSet();

			/*Scanner sc=new Scanner(System.in);
			System.out.println("enter num");
			num =sc.nextInt();
			*/
		System.out.println("prog for prime num");
		
			for( num=3;num<=100;num++)

			{
//System.out.println("for1");
			for(int j=2;j<=num-1;j++)
			{
				if(num%j==0)
				{
					flag=0;			
					break;		
				}
				else
				{
					flag=1;
					set.add(num);
					
				}

				
			}
			}
            System.out.println("arraylist: "+set);

			}
			
		

			}
	
	


