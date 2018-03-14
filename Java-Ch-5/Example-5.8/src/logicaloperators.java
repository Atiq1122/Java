
public class logicaloperators {
	public static void main( String[] args ) {
		System.out.println("Conditional AND (&&)\n"+ "false && false:"+(false&&false)+
		"\nfalse && true:"+(false&&true)+
		"\ntrue && false:"+(true&&false)+
		"\ntrue && true:"+(true&&true)+"\n");
		
		System.out.println("Conditional OR (||)\n"+ "false || false:"+(false||false)+
				"\nfalse || true:"+(false||true)+
				"\ntrue || false:"+(true||false)+
				"\ntrue || true:"+(true||true)+"\n");
		
		System.out.println("Bolean logical AND (&)\n"+ "false & false:"+(false&false)+
				"\nfalse & true:"+(false&true)+
				"\ntrue & false:"+(true&false)+
				"\ntrue & true:"+(true&true)+"\n");
		
		System.out.println("boleanlogical inclusive OR(|)\n"+ "false | false:"+(false|false)+
				"\nfalse | true:"+(false|true)+
				"\ntrue | false:"+(true|false)+
				"\ntrue | true:"+(true|true)+"\n");
		
		System.out.println("Bolean logical exclusive OR (^)\n"+ "false ^ false:"+(false^false)+
				"\nfalse ^ true:"+(false^true)+
				"\ntrue ^ false:"+(true^false)+
				"\ntrue ^ true:"+(true^true)+"\n");
		
		System.out.println("logical not(!)\n"+ "!false:"+(!false)+"!true:"+(!true));
	}
}
