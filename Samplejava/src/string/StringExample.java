package string;

public class StringExample {

	public static void main(String[] args) {
		String s="Sachin"; 
		String s1="SACHIN";
		String s2="anil";
		String s3="Java is simple";
		String s4="Hello World";
		s=s.concat("Tendulkar");
		System.out.println(s.length());
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s2.compareTo(s));
		System.out.println(s.charAt(3));    
		System.out.println(s2.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s4.trim());
		System.out.println(s3.replace("Java", "Python"));
		System.out.println(s4.startsWith("H"));
		System.out.println(s4.endsWith("d"));
		System.out.println(s4.contains("Hello"));
		int a=10;
		System.out.println(String.valueOf(a));
		//System.out.println(a+s4);*/
	} 
	
	

}
   