package aa;

class Reverse
{
	public static void main(String args[])
	{
	String str[]="My name is Snehal bhojane".split(" " );
		String finalStr="";
		for(int i=str.length-1;i>=0;i--)
		{
			finalStr += str[i] + " ";
		}
		System.out.println(finalStr);
	}
}
