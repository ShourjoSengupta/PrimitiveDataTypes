//Write a program covering all primitive data types
package PrimitiveDataTypes;

public class CaseStudy {

	public static void main(String[] args) {
		char character = '*';
		byte Byte =4;
		int Int=16;
		float Float=3.23f;
		boolean Bool = true;
		double Double = 4.555555555;
		long Long = 55338846l;
		short Short = 52;
		
		System.out.println("Can we multiplying all data types? "+ (Byte*Int*Float*Double*Long*Short + "using operator: " + character+Bool));

	}

}
