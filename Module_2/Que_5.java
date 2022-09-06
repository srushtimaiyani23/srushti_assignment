package Module_2;

public class Que_5 {
public static void main(String[] args) {
	String s="Red is favourite Color";
	String s1="Orange is also favourite Color";
	String s2="Red";
	boolean b1=s.startsWith(s2);
	boolean b2=s1.startsWith(s2);
	System.out.println(s+" start with "+s2+" := "+b1);
	System.out.println(s1+" start with "+s2+" := "+b2);
	
}
}
