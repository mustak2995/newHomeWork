package finalkeyword;

final  class Dummy  //final class
{
	
}
class MoreDummy 
{
	public final void somefunction()  //final method
	{
		
	}
}
class SomeDummy extends MoreDummy
{
	//public void somefunction()  //final method
	{
	 //cannot overridden final method.	
	}
}
public class FinalInstanceVariable {
	
	private final int x=5; //final instance member variable.
	
	//{x=5;} initilazation block
	/*FinalInstanceVariable()
	{
		x=5;
	}*/
	
	private final  static int y=3;//final static member variable OR
	private static final int ya=3;//final static member variable OR
	static
	{
		//y=3;
	}
	public void fun()
	{
		final int k=3; // final local variable.
		
	}

	public static void main(String[] args) {
		
		FinalInstanceVariable fv=new FinalInstanceVariable();	
	     

	}

}
