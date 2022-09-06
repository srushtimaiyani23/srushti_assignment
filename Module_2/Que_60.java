package Module_2;

import java.util.ArrayList;

public class Que_60 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	System.out.println("color list is :");
	a1.add("pink");
	a1.add("black");
	a1.add("white");
	a1.add("blue");
	
	System.out.println("list "+a1);
	
	a1.ensureCapacity(3);
	a1.add("green");
	a1.add("orange");
	System.out.println("increse the size :"+a1);
} 

}
