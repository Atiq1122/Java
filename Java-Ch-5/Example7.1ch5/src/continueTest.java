
public class continueTest {

	public static void main(String[] args) {
		for	(int count = 1; count <= 10; count++ ) 
		{
		if ( count == 5 )
			continue;
						System.out.print( " " + count );
		}
				System.out.println( "\nUsed continue to skip printing 5" );
	}
}
