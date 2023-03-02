
import java.io.InputStream;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import java.util.Scanner;



public class Accounts extends Admin {
	
	
	public Accounts(InputStream in) {
		// TODO Auto-generated constructor stub
	}
	/*
	public void addmin()
	{
		 int  temp1=0;
		 Scanner obj2= new Scanner(System.in);
		 while(true)
		 {  menuAdmin(); 
		 
		
		 if(obj2.hasNextInt())
		 {
		   temp1= obj2.nextInt();
		 
		    	 switch(temp1)
		     {
		    
		     case 1:
		    	 System.out.println("Enter Name of Customer");
		    		
		    		Scanner obj= new Scanner(System.in);
		    		String name="";
		    		 
		    			 name= obj.nextLine();
		    		 
		    		
		    		
		    		System.out.println("Enter Address");
		    		String addr= obj.nextLine();
		    		
		    		System.out.println("Enter Phone number");
		    		String con= obj.nextLine();
		    		
		    		System.out.println("Enter Account Type");
		    		String type= obj.nextLine();
		    		
		    		
		    		System.out.println("Enter Account ID");
		    		int id= obj.nextInt();
		    		
		    		System.out.println("Enter Intial Balance");
		    		double bal= obj.nextDouble();
		    		while(bal<0)
		    		{
		    			System.out.println("Amount cannot be negative:");
		    			System.out.println("Enter Intial Balance Again");
		    			bal= obj.nextDouble();
		    		}
		    		
		    		DateTimeFormatter d= DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mm a z");
		    		ZonedDateTime dat = ZonedDateTime.now();
		    		String date = d.format(dat);
		    		 String t="Deposited " + bal;
		    		 
		    	 create_account(name,addr,con,id,type,bal,date,date,t,0.0,0.0);
		    	 
		    	 break;
		     case 2:
		    	 System.out.println("Enter Account ID");
		    		 obj= new Scanner(System.in);
		    		 id= obj.nextInt();
		    	 close_account(id);
		    	 break;
		     case 3:
		    	 System.out.println("Enter Account ID:");
		    		Scanner obj4= new Scanner(System.in);
		    		int id1= obj4.nextInt();
		    	 LoginAccount(id1);
		    	 break;
		     case 4:
		    	
		    		System.out.println("\nEnter new value of Interest Rate:");
		    		 obj= new Scanner(System.in);
		    		double temp5= obj.nextInt();
		    		while(temp5<0)
		    		{
		    			System.out.println("Amount cannot be negative:");
		    			System.out.println("Enter Again");
		    			temp5= obj.nextInt();
		    		}
		    		InterestRate(temp5);
		    		System.out.println("\nInterest Rate Updated\n");
		    	 
		    	 break;
		     case 5:
		    	DisplayAll();
		    	break;
		     case 6:
		    	 System.out.println("Enter Account ID");
		    		 obj= new Scanner(System.in);
		    		 id= obj.nextInt();
		    		double temp=calculatelnterest(id);
		    		System.out.println( "total interest is: " + temp);
		    	
		    	break;
		     case 7: 
		    	
		    	 System.out.println("Enter Account ID");
	    		 obj= new Scanner(System.in);
	    		 id= obj.nextInt();
    	    	double temp2=DisplayAllDeductions(id);
    	    	System.out.println( "Deduction on this account is: " + temp2);
    	    	
		    	 break;
		     case 9:
		    	System.exit(0);
		     case 0:
		    	return;
		    	default:
		    		System.out.println("Wrong input! Try Again");
		    		
		     }
		 }
		    	 //obj2.close();	
		   // obj2.nextLine();
		 }
		// obj2.close();
		 
	}
	
	public void Custom()
	{ 
		int  temp=0;
		 Scanner obj1= new Scanner(System.in);
		menu2(); 
		 temp= obj1.nextInt();
			 switch(temp)
		     {
			     case 1:
			    	 int  temp1=0;
			    	 Scanner obj2= new Scanner(System.in);
			    	 while(true)
			    	 { menuCustomerSaving(); 
			    	
			    	 if(obj2.hasNextInt())
			    	 {
			    	   temp1= obj2.nextInt();
			    	 
			    	    	 switch(temp1)
			    	     {
			    	     
			    	     case 1:
			    	    	 System.out.println("Enter Account ID");
			    	    		Scanner obj= new Scanner(System.in);
			    	    		int id= obj.nextInt();
			    	    		System.out.println("\nEnter Amount: \n");
			    	    		int b= obj.nextInt();
			    	    		while(b<0)
			    	    		{
			    	    			System.out.println("Amount cannot be negative:");
			    	    			System.out.println("Enter Again");
			    	    			b= obj.nextInt();
			    	    		}
			    	    	deposit(b,id);
			    	    	 break;
			    	     case 2:
			    	    	 System.out.println("Enter Account ID");
			    	    		 obj= new Scanner(System.in);
			    	    		 id= obj.nextInt();
			    	    		System.out.println("\nEnter Amount: \n");
			    	    		b= obj.nextInt();
			    	    		while(b<0)
			    	    		{
			    	    			System.out.println("Amount cannot be negative:");
			    	    			System.out.println("Enter Again");
			    	    			b= obj.nextInt();
			    	    		}
			    	    	 withdraw(b,id);
			    	    	 break;
			    	     case 3:
			    	    	 System.out.println("Enter Account ID");
		    	    		 obj= new Scanner(System.in);
		    	    		 id= obj.nextInt();
		    	    	 System.out.println(balance(id));
			    	    	 break;
			    	     case 4:
			    	    	 pstatement();
			    	    	 break;
			    	     case 5:
			    	    	 System.out.println("\nEnter Sender Account ID:\n");
			    	    		 obj= new Scanner(System.in);
			    	    		int id1= obj.nextInt();
			    	    		System.out.println("\nEnter Reciver Account ID:\n");
			    	    		int id2= obj.nextInt();
			    	    		System.out.println("\nEnter Amount: \n");
			    	    		 b= obj.nextInt();
			    	    		while(b<0)
			    	    		{
			    	    			System.out.println("Amount cannot be negative:");
			    	    			System.out.println("Enter Again");
			    	    			b= obj.nextInt();
			    	    		}
			    	    	transferAmount(b,id1,id2);
			    	    	break;
			    	     case 6:
			    	    	 System.out.println("Enter Account ID");
			    	    		obj= new Scanner(System.in);
			    	    		 id= obj.nextInt();
			    	    		double zak=ZakatFun(id);
			    	    		System.out.println( "Zakat on your Account Balance is: " + zak);
			    	    	
			    	    	break;
			    	     case 7:
			    	    	 System.out.println("Enter Account ID");
			    	    		 obj= new Scanner(System.in);
			    	    		 id= obj.nextInt();
				    	    	double temp2=DisplayAllDeductions(id);
				    	    	System.out.println( "Deduction on this account is: " + temp2);
				    	    	break;
			    	     case 8:
			    	    	 System.out.println("Enter Account ID");
				    		 obj= new Scanner(System.in);
				    		 id= obj.nextInt();
				    		double temp4=calculatelnterest(id);
				    		System.out.println( "total interest is: " + temp4);
				    	    	break;
			    	     case 9:
			    		    	System.exit(0);
			    	     case 0:
			    	    	return;
			    	    	default:
			    	    		System.out.println("Wrong input! Try Again");
			    	    		
			    	     }
			    	 }
			    	    	 //obj2.close();	
			    	   // obj2.nextLine();	 
			    	 }
			    	 
			    	 
			    	 
			    	 
			    	 
			    	 
			    	 
			    	 
			     case 2:
			    	 
			    	 int  temp2=0;
			    	 Scanner obj3= new Scanner(System.in);
			    	 while(true)
			    	 { menuCustomerChecking(); 
			    	
			    	 if(obj3.hasNextInt())
			    	 {
			    	   temp2= obj3.nextInt();
			    	 
			    	    	 switch(temp2)
			    	     {
			    	     
			    	     case 1:
			    	    	 System.out.println("Enter Account ID");
			    	    		Scanner obj= new Scanner(System.in);
			    	    		int id= obj.nextInt();
			    	    		System.out.println("\nEnter Amount: \n");
			    	    		int b= obj.nextInt();
			    	    		while(b<0)
			    	    		{
			    	    			System.out.println("Amount cannot be negative:");
			    	    			System.out.println("Enter Again");
			    	    			b= obj.nextInt();
			    	    		}
			    	    	deposit(b,id);
			    	    	 break;
			    	     case 2:
			    	    	 System.out.println("Enter Account ID");
			    	    		 obj= new Scanner(System.in);
			    	    		 id= obj.nextInt();
			    	    		System.out.println("\nEnter Amount: \n");
			    	    		 b= obj.nextInt();
			    	    		while(b<0)
			    	    		{
			    	    			System.out.println("Amount cannot be negative:");
			    	    			System.out.println("Enter Again");
			    	    			b= obj.nextInt();
			    	    		}
			    	    	 withdraw(b,id);
			    	    	 break;
			    	     case 3:
			    	    	 System.out.println("Enter Account ID");
			    	    		 obj= new Scanner(System.in);
			    	    		 id= obj.nextInt();
			    	    	 System.out.println(balance(id));
			    	    	 break;
			    	     case 4:
			    	    	 pstatement();
			    	    	 break;
			    	     case 5:
			    	    	 System.out.println("\nEnter Sender Account ID:\n");
		    	    		 obj= new Scanner(System.in);
		    	    		int id1= obj.nextInt();
		    	    		System.out.println("\nEnter Reciver Account ID:\n");
		    	    		int id2= obj.nextInt();
		    	    		System.out.println("\nEnter Amount: \n");
		    	    		 b= obj.nextInt();
		    	    		while(b<0)
		    	    		{
		    	    			System.out.println("Amount cannot be negative:");
		    	    			System.out.println("Enter Again");
		    	    			b= obj.nextInt();
		    	    		}
		    	    	transferAmount(b,id1,id2);
			    	    	break;
			    	     case 7:
			    	    	 System.out.println("Enter Account ID");
		    	    		 obj= new Scanner(System.in);
		    	    		 id= obj.nextInt();
			    	    	double temp3=DisplayAllDeductions(id);
			    	    	System.out.println( "Deduction on this account is: " + temp3);
				    	    	break;
			    	     case 9:
			    		    	System.exit(0);
			    	     case 0:
			    	    	return;
			    	    	default:
			    	    		System.out.println("Wrong input! Try Again");
			    	    		
			    	     }
			    	 }
			    	    	 //obj2.close();	
			    	   // obj2.nextLine();	 
			    	 }
			    	 
			     case 9:
				    	System.exit(0);
			     case 0:
	    	    	 return;
			    	 
		     }
			
		 return;
	     
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
//MainMenu m1= new MainMenu();
  
Accounts Acc= new Accounts(System.in);
Acc.menu1();  
System.out.println("Press The Button");
Scanner obj1= new Scanner(System.in);
int temp= obj1.nextInt();
while(true)
{if(temp==1)
	{ 
	Acc.addmin();
	Acc.menu1();    
	System.out.println("Press The Button");
	
	obj1= new Scanner(System.in);
	 temp= obj1.nextInt();
	}
if(temp==2)
	{
	Acc.Custom();
	Acc.menu1();    //static function call
	System.out.println("Press The Button");
	
	obj1= new Scanner(System.in);
	 temp= obj1.nextInt();
	}
if(temp==9)
    	System.exit(0);
}
	}
*/
}
