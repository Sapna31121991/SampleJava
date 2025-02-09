package string;

public class StringBuilderExample {

	public static void main(String[] args) {
	StringBuilder s=new StringBuilder("World");
	s.append("is");
	System.out.println(s);
	s.insert(0, "Beautiful");
	System.out.println(s);
	s.replace(0, 5, "Very");
	System.out.println(s); 
	s.delete(0, 3);
	System.out.println(s);
	s.reverse();
	System.out.println(s);
	System.out.println(s.capacity());
	
	
	

	}

}
