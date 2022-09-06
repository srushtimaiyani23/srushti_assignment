package Module_2;

public class Que_4 {
public static void main(String[] args) {
	String s="Java Exercises";
	String s1="Java Exercise";
	String s2="se";
	
	boolean b1=s.endsWith(s2);
	boolean b2=s1.endsWith(s2);
	System.out.println(s+" end with = "+s2+":"+b1);
	System.out.println(s1+" end with = "+s2+":"+b2);
}
}
