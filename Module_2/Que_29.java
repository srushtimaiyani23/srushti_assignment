package Module_2;

import java.util.Scanner;



class deposite extends Exception
{
	double am;
	public deposite(double need)
	{
		this.am=need;
	}
}
class Atm
{
	public void withdraws(double amount,double balance) throws deposite
	{
		if(balance>amount)
		{
			balance-=amount;
			System.out.println("rupees available" +balance);
		}
		else
		{
			double need=amount-balance;
			throw new deposite(need);
		}
	}
}
public class Que_29 {
public static void main(String[] args) {
	Atm a=new Atm();
	Scanner sc=new Scanner(System.in);
	double balance=2000;
	System.out.println("enter amount withdraws :");
	double amount=sc.nextInt();
	try {
		a.withdraws(amount,balance);
	}
	catch (deposite e) 
	{
		System.out.println("insufficient balance,you need more "+e.am+"ruppes transection");
	}
	
}
}
