
public class breakTest {

	public static void main(String[] args) {
		int count;
		for	( count = 1; count <= 10; count++ ) 
		{
		if ( count == 7 )
			break;
						System.out.print( " " + count );
		}
				System.out.print( "\nBroke out of loop at count = " + count );
	}

}
