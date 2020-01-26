package aa;

public class RecursionFact {
static int fact=1;
public  static Object fact(int num){
	if(num!=0)
	fact=fact*num;
if(num==0)
	{
		return 1;
	}
	else{
		return fact(num-1);
	}
	}
public static void display()
{
	System.out.println("factorial of num is  :"+fact);

}
}
