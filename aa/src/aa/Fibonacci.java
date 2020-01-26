package aa;
//prog for fibonacci seris till 10 digit
//The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, .
public class Fibonacci {

	public static void main(String[] args) {
int n=10, t1=0,t2=1;

for (int i=1;i<=10;i++)
{
	System.out.print(t1+" ");
	int sum=t1+t2;
	t1=t2;
	t2=sum;
}
		
	}

}
