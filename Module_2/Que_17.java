package Module_2;

class Bank
{
	public void getBalance()
	{
		
	}
}
class BankA extends Bank
{
	public void getBalance()
	{
		System.out.println("deposited : $100");
	}
}
class BankB extends Bank
{
	public void getBalance()
	{
		System.out.println("deposited : $150");
	}
}
class BankC extends Bank
{
	public void getBalance()
	{
		System.out.println("deposited : $200");
	}
}
public class Que_17 {
public static void main(String[] args) {
	BankA b1=new BankA();
	BankB b2=new BankB();
	BankC b3=new BankC();
	System.out.println("Bank balance :====");
	b1.getBalance();
	b2.getBalance();
	b3.getBalance();
	
}
}
