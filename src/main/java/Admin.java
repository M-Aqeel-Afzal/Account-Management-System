import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Admin extends MainMenu {
	Customer list;
	double interestRate;
	public Admin()
	{
		list = new Customer();
		interestRate=0;
	}
public void create_account(String n,String addr,String con,int id,String flg,double bal,String dat,String tran,String t,double ft,double intr)                      //Create a new Account
{
	
   list=list.insert(list,n,addr,con,id,flg,bal,dat,tran,t,ft,intr);
//obj.close();
}
public void deposit(double b,int id)
{
	
	list.makeDeposit(b,id);
}

public void withdraw(double b,int id)
{
	
	list.makeWithDraw(b,id);
}

public void close_account(int id)                      //Close or Delete a Sepecific Account
{
	
   list=list.deleteAccount(id);

}

public boolean LoginAccount(int id)            //login to specific Account
{

   boolean b=list.Login(id);
return b;
}

public void DisplayAll()          //Display All Accounts
{
	list.ShowAllAccount();


}

public void InterestRate(double intr)          //Interest Rate sepecifer function
{
	interestRate=intr;
}
/*
public void DisplayAllDeductions()          //Display All Accounts
{
	System.out.println("Enter Account ID");
	Scanner obj= new Scanner(System.in);
	int id= obj.nextInt();
	list.interest(interestRate, id);
	


}
*/
public boolean transferAmount(double b,int id1,int id2)           //transferAmount function
{
	boolean flag1=LoginAccount(id1);
	boolean flag2=LoginAccount(id1);
	
	if(flag1==true&&flag2==true)
	{ list.makeWithDraw(b,id1);
	list.makeDeposit(b,id2);
	return true;
	}
	else return false;
}
	
public double DisplayAllDeductions(int id)       //displaying all deduction
{
	
	double temp=list.deduction(id);
	return temp;
}
public double calculatelnterest(int id)     //calculating all interest
{
	
	double temp=list.interest(interestRate,id);
	return temp;
}
public double balance(int id)
{
	
	double b=list.CheckBalance(id);
	return b;
}

public void pstatement()
{
	System.out.println("Enter Account ID");
	Scanner obj= new Scanner(System.in);
	int id= obj.nextInt();
	list.CheckBalance(id);
list.printStatement(id);
}
public double ZakatFun(int id)
{
	
double temp=list.calculateZakat(id);
return temp;
}

}
