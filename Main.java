//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tomas Oh
public class Main
{
	public static void main(String[] args)
	{
		
    int[] nums = {7,28,496,1111,199,201,17};
    //see readme file for additional code
    for( int num : nums )
    {
      Number one = new Number( num );
      if ( one.isOdd() )
	      System.out.print( one + " is odd.\n" );
      else 
	      System.out.print( one + " is not odd.\n" );
	
      if ( one.isPerfect() )
	      System.out.print( one + " is perfect.\n" );
      else 
	      System.out.print( one + " is not perfect.\n" );
    }
    
           
	}
}