package stringclass;

public class ImmutableChecked
{

	public static void main(String[] args)
	{
		// IMMUTABLE CONCEPT :      it will not change the original String value until we assign it 
		String s = "abc";
		s.concat("software"); 
		System.out.println(s);

		// MUTABLE CONCEPT       : it will change the original String value 
		StringBuffer sb = new StringBuffer ("abc");
		sb.append("software");
		System.out.println(sb);
	}

}
