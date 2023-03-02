import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

//import java.io.*;
public class Customer {
	node head;
	 class node {
 String Name;
 String Address;
 String Contact;
 int AccountID;
 String  type;
 double balance=0;
 String date_created;
 String last_transection;
 String last_T;
 double fee_t=0;
 double interest=0.0;
	node next;
node(String n,String addr,String con,int id,String flg,double bal,String dat,String tran,String t,double ft,double intr)
{
	Name=n;
	Address=addr;
	Contact=con;
	AccountID=id;
	type=flg;
	balance=bal;
	date_created=dat;
	last_transection=tran;
	last_T=t;
	fee_t=ft;
	interest=intr;
}
	}
	
	public Customer insert(Customer C_list,String n,String addr,String con,int id,String flg,double bal,String dat,String tran,String t,double ft,double intr)
    {
       
        node temp_node = new node(n,addr,con,id,flg,bal,dat,tran,t,ft,intr);
        temp_node.next = null;
   
       
        if (C_list.head == null) {
        	C_list.head = temp_node;
        }
        else {
            
            node last = C_list.head;
            while (last.next != null) {
                last = last.next;
            }
   
           
            last.next = temp_node;
        }
   
       
        return C_list;
    }
	
	public Customer deleteAccount(int id)
{
node temp = this.head, prev = null;

if (temp != null && temp.AccountID == id) {
this.head = temp.next; // Changed head


System.out.println("Account founded and deleted");
return this;
}
else {


while (temp != null && temp.AccountID != id) {
    prev = temp;
    temp = temp.next;
}


if (temp != null) {
    prev.next = temp.next;
    System.out.println("Account founded and deleted");
}

if (temp == null) {
    System.out.println("Account not found");
}
return this;
}


}
	
	
	public boolean Login(int id)
	{
	node temp = this.head, prev = null;

	if (temp != null && temp.AccountID == id) {
	
		 System.out.println("Login Successful!");
	return true;
	}
	else {


	while (temp != null && temp.AccountID != id) {
	    prev = temp;
	    temp = temp.next;
	}


	if (temp != null) {
		 System.out.println("Login Successful!");
		 return true;
	}

	if (temp == null) {
	    System.out.println("Account not found");
	    return false;
	}
	}

	return true;
	
	}
	
	
	
	public void ShowAllAccount()
	{
	    node temp = this.head;

	    System.out.print(" All Bank Accounts Are: ");

	    while (temp != null) {
	    	 System.out.println();
	        System.out.println("Holder Name: " + temp.Name + "\nAccount ID: " + temp.AccountID + "\nAddress: " + temp.Address
	        		+ "\nContact: " + temp.Contact + "\nAccount Type: " + temp.type + "\n\nBalance: " + temp.balance +"\n\nLast Transection: "
	        		+ temp.date_created + "\n\n\n");

	       
	        temp = temp.next;
	    }

	    System.out.println();
	}
	
	
	
	public void makeDeposit(double b,int id)  //deposit function
	{

node temp = this.head, prev = null;

if (temp != null && temp.AccountID == id) {
	temp.balance+=b;
	if(temp.type.equals("Checking")||temp.type.equals("checking"))
	temp.fee_t +=10;

	DateTimeFormatter d= DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mm a z");
	ZonedDateTime dat = ZonedDateTime.now();
	String date = d.format(dat);
	temp.last_T="Deposied " + b;
    temp.last_transection=date;
    
System.out.println("Deposit Successful---!");

}
else {

while (temp != null && temp.AccountID != id) {
    prev = temp;
    temp = temp.next;
}


if (temp != null) {
	temp.balance+=b;
	if(temp.type.equals("Checking")||temp.type.equals("checking"))
		temp.fee_t +=10;

	DateTimeFormatter d= DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mm a z");
	ZonedDateTime dat = ZonedDateTime.now();
	String date = d.format(dat);
    temp.last_transection=date;
    temp.last_T="Deposied " + b;
	System.out.println("Deposit Successful---!");
}

if (temp == null) {
    System.out.println( "Account not found");
}
}

		
	}
	public void makeWithDraw(double b,int id)  //Withdraw function
	{

node temp = this.head, prev = null;

if (temp != null && temp.AccountID == id) {
	temp.balance-=b;
	temp.last_T="WithDrawn " + b;
	if(temp.type.equals("Checking")||temp.type.equals("checking"))
		temp.fee_t +=10;
	DateTimeFormatter d= DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mm a z");
	ZonedDateTime dat = ZonedDateTime.now();
	String date = d.format(dat);
    temp.last_transection=date;
    
System.out.println("Withdraw Successful---!");

}


while (temp != null && temp.AccountID != id) {
    prev = temp;
    temp = temp.next;
}


if (temp != null) {
	temp.balance-=b;
	temp.last_T="WithDrawn " + b;
	
	if(temp.type.equals("Checking")||temp.type.equals("checking"))
		temp.fee_t +=10;
	DateTimeFormatter d= DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mm a z");
	ZonedDateTime dat = ZonedDateTime.now();
	String date = d.format(dat);
    temp.last_transection=date;
    
	System.out.println("Withdraw Successful---!");
}

if (temp == null) {
    System.out.println("Account not found");
}



		
		
	}
	public double CheckBalance(int id)  //CheckBalance function          
	{

node temp = this.head, prev = null;

if (temp != null && temp.AccountID == id) {

return temp.balance;
}
else {

while (temp != null && temp.AccountID != id) {
    prev = temp;
    temp = temp.next;
}


if (temp != null) {
	
	return temp.balance;
}

if (temp == null) {
    System.out.println( "Account not found");
    
}


}

return 0;	
	}
public void printStatement(int id)              //printing transection statement

	{
		node temp = this.head, prev = null;

		if (temp != null && temp.AccountID == id) {
		
			 System.out.println("\n\nTransection Staement\n\n");
		        System.out.println("Holder Name: " + temp.Name + "\nAccount ID: " + temp.AccountID + "\nAddress: " + temp.Address
		        		+ "\nContact: " + temp.Contact + "\nAccount Type: " + temp.type + "\n\nCurrent Balance: " + temp.balance +"\n\nTransected at:  " 
		        		+ temp.date_created + "Last Transection" + temp.last_T + "\n\n\n");

		
		}


		while (temp != null && temp.AccountID != id) {
		    prev = temp;
		    temp = temp.next;
		}


		if (temp != null) {
			System.out.println();
	        System.out.println("Holder Name: " + temp.Name + "\nAccount ID: " + temp.AccountID + "\nAddress: " + temp.Address
	        		+ "\nContact: " + temp.Contact + "\nAccount Type: " + temp.type + "\n\nCurrent Balance: " + temp.balance +"\n\nTransected at:  " 
	        		+ temp.date_created + "Last Transection" + temp.last_T + "\n\n\n");

		}

		if (temp == null) {
		    System.out.println(id + " Account not found");
		}


		
		
}

public double calculateZakat(int id)            //zakat calution
{

node temp = this.head, prev = null;

if (temp != null && temp.AccountID == id&& temp.type.equals("saving")&&temp.balance>=20000) {
	
	double zak=(temp.balance*2.5)/100;
return zak;
	

}

else {
while (temp != null && temp.AccountID != id) {
    prev = temp;
    temp = temp.next;
}


if (temp != null&& temp.type.equals("saving")&&temp.balance>=20000) {
	double zak=(temp.balance*2.5)/100;
	return zak;
}

if (temp == null) {
    System.out.println( " Account not found or balance is less then 20000/-");
}
}
return 0;
}
public double deduction(int id)                                 //deduction function      
{

node temp = this.head, prev = null;

	if (temp != null && temp.AccountID == id) {
		if(temp.type.equals("saving"))
		{
			
			return temp.fee_t;				
		}
		else
		{
			double zak=(temp.balance*2.5)/100;
			return zak;
		}

}
	else
	{


while (temp != null && temp.AccountID != id) {
    prev = temp;
    temp = temp.next;
}


if (temp != null) {
	if(temp.type.equals("saving"))
	{
		
			return temp.fee_t;		
	}
	else
	{
		double zak=(temp.balance*2.5)/100;
		return zak;
	}
}

if (temp == null) {
    System.out.println( " Account not found");
}

}
	return 0;
}




public double interest(double intr,int id)                //interest function
{

node temp = this.head, prev = null;

	if (temp != null && temp.AccountID == id) {
		System.out.println( "entered");
		if(temp.type.equals("saving"))
		{
			
				temp.interest=(temp.balance*intr)/100;
				return temp.interest;
		}
		else
		{
			
			return -1;
		}

}
	else
	{
	



while (temp != null && temp.AccountID != id) {
    prev = temp;
    temp = temp.next;
}


if (temp != null) {
	if(temp.type.equals("saving"))
	{
		
			temp.interest=(temp.balance*intr)/100;
			return temp.interest;
			
	}
	else 
	{
		return -1;
	}
}

if (temp == null) {
    System.out.println( "Account not found");
}
	
}
	return 0;
}
	
}