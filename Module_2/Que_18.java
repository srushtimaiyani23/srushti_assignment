package Module_2;

class Marks
{
	public void getPercentage()
	{
		
	}
}
class StudentA extends Marks
{
	int s1,s2,s3;
	public void getPercentage()
	{
		s1=s1;
		s2=s2;
		s3=s3;
		System.out.println("SE mark :"+s1);
		System.out.println("TC mark :"+s2);
		System.out.println("OOPSJAVA mark :"+s3);
		System.out.println("total of marks :"+(s1+s2+s3));
		System.out.println("percentage of marks :"+(s1+s2+s3)*100/300);
		
	}
}
class StudentB extends Marks
{
	int s1,s2,s3,s4;
	public void getPercentage()
	{
		s1=s1;
		s2=s2;
		s3=s3;
		s4=s4;
		System.out.println("SE mark :"+s1);
		System.out.println("TC mark :"+s2);
		System.out.println("OOPSJAVA mark :"+s3);
		System.out.println("PHP mark :"+s4);
		System.out.println("total of marks :"+(s1+s2+s3+s4));
		System.out.println("percentage of marks :"+(s1+s2+s3+s4)*100/300);
		
	}
}
public class Que_18 {
	public static void main(String[] args) {
		StudentA d1=new StudentA();
		System.out.println("CLASS A =");
		d1.s1=45;
		d1.s2=78;
		d1.s3=59;
		d1.getPercentage();
		System.out.println("==================");
		System.out.println("CLASS B =");
		StudentB b1=new StudentB();
		b1.s1=67;
		b1.s2=66;
		b1.s3=99;
		b1.s4=70;
		b1.getPercentage();
		
	}

}
