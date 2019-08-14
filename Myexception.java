package capgemini.exception;
//import java.io.FileInputStream;
//java My exception 10 a
// java MyException 10 0
public class Myexception {
	private static int div1 (int no1, int no2){ 
		// unhandled exception type Exception 
		try{
		if(no2<=0)
			throw new Exception ("no2 has a value:"+no2); 
		}catch(Exception e) {
		System.err.println("cannot divide by zero");
	}
		return no1/no2;
		}
	private	static int div2 (int no1, int no2) throws Exception {
			if(no2<=0)
				throw new Exception ("second value:"+no2); 
			return no1/no2;
		}	
	private	static int div3 (int no1, int no2) throws DivisionException {
		if(no2 <= 0)
			throw new DivisionException ("second value:"+no2); 
		return no1/no2;
	}	
		public static void main(String[] args) throws Exception{
		System.out.println("started");
	if(args.length<2) {
		System.out.println("please provide 2 arguments");
		System.exit(0);
	}
	int no1, no2,result;
	no1=no2=result=0;
	try{
		no1=Integer.parseInt(args[0]);
		no1=Integer.parseInt(args[1]);
		result=no1/no2;
	
		System.out.println("Result:"+result);
	}catch (NumberFormatException ex){
		System.err.println("please provide 2 numeric arguments..");
		ex.printStackTrace();
	}
	catch(ArithmeticException ex){
		System.err.println("please provide 2nd non 0 argument..");
	}
	catch(Exception ex)  {
		System.err.println("Exception occured in div2... no2 has no value ");
	}
	finally {
		System.out.println("i will execute in any condition");
	} 
	System.out.println("end");
		}

	// Unhandled exception type FileNotFoundException
}	
	
		
