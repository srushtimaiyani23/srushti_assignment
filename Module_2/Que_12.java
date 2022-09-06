package Module_2;

class mem
{
	String name;
	int age;
	String number;
	String address;
	int salary;
	
	public void print()
	{
		System.out.println(salary);
	}
}

class emp extends mem
{
	int age;
	String name;
	String number;
	String address;
	String specilization;
	public void show()
	{
		age=age;
		name=name;
		address=address;
		number=number;
		specilization=specilization;
		
	}
	public void display()
	{
		System.out.println("enter name: " +name);
		System.out.println("enter age : " +age);
		System.out.println("enter phone number : "+number);
		System.out.println("enter address : "+address);
		System.out.println("enter specilization :"+specilization);
		System.out.println("enter salary : "+salary);
	}
	
	
}
class mana extends mem
{
	int age;
	String name;
	String number;
	String address;
	String department;
	public void show()
	{
		age=age;
		name=name;
		address=address;
		number=number;
		
		
	}
	public void display()
	{
		System.out.println("enter name: " +name);
		System.out.println("enter age : " +age);
		System.out.println("enter phone number : "+number);
		System.out.println("enter address : "+address);
		System.out.println("enter department :"+department);
		System.out.println("enter salary : "+salary);
	}
	
	
}

public class Que_12 {
public static void main(String[] args) {
	emp e=new emp();
	e.name="srushti";
	e.age=19;
	e.number="9925647837";
	e.address="surat";
	e.salary=90000;
	e.specilization="smartness";
	
	mana m=new mana();
	m.name="payal";
	m.age=19;
	m.number="6320202221";
	m.address="amreli";
	m.salary=70000;
	m.department="accountant";
	e.show();
	e.display();
	System.out.println("==================");
	m.show();
	m.display();
}
}
