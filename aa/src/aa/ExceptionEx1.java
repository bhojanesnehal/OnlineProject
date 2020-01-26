package aa;

public class ExceptionEx1 {

	public static void main(String[] args) {

		ExceptionEx ex=new ExceptionEx();
		try{
		ex.get();
		}
		catch(ArithmeticException e)
		{
			e.getClass();
			e.hashCode();
			System.out.println("ArithmeticException caught");
		}
	}

}
