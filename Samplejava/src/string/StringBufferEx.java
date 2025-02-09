package string;

public class StringBufferEx {
	public static void main(String args[])
	{
	StringBuffer s=new StringBuffer("Hello");
	s.append("World");
	System.out.println(s);
	s.insert(4,"Beutiful");
	System.out.println(s);
	s.replace(5, 7,"country");
	System.out.println(s);
	s.delete(5, 7);
	System.out.println(s);
	s.reverse();
	System.out.println(s);
	System.out.println(s.capacity());
	}

}
