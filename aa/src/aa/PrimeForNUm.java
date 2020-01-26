package aa;

import java.util.Scanner;

public class PrimeForNUm {
	
		public static void main(String[] args)
		{
			int flag=0;
			int num;
			Scanner sc=new Scanner(System.in);
				System.out.println("enter num");
				num =sc.nextInt();
				
			System.out.println("prog for prime num");
			
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
				}
			}
			if(flag==1)
			System.out.println("num is prime :"+num);
		}

	}

		

