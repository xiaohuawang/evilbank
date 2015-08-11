package evilbank;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class Evil {

	
    
	public static void main(String[] args)
	{
		
		
		
		 String aa[]=new String[100];//type
	     int bb[]=new int[100];      //number
	     double cc[]=new double[100];//balance
	     long ff[]=new long[100];
	     int dd[]= new int[100]; // input number
	     double ee[]=new double[100];//input balance
	     String gg[]=new String[100];
	    		 
         double balance1=0;
		double balance=0;
		int s=0;
		
		System.out.println("Welcome to Evil Corp Savings and Loan");
		System.out.println("Please create the user account(s)");
		
		HashMap<Integer,Double> map = new HashMap<Integer,Double>();
		 
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the account number");
			int number=sc.nextInt();
			if(number<0)
			    	break;
			dd[s]=number;
			 
			System.out.println("Enter the account balance");
			 balance=sc.nextDouble();
		     ee[s]=balance;
			 
			 map.put(number,balance);
		   
		     s++;
			
			
		}
		
		
		
		System.out.println( "map = " + map );
	
		//Double dd[]=new Double[100];
		
		
		//System.out.println("Enter the account number");
		
		int i=0;
		double sum=0.0;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
		
			   
      	 System.out.println("Enter the account number or -1 to finish");// # 7779311 : Homer Simpson
				
		int number1=sc.nextInt();
		bb[i]=number1;
		
		
		
		if(number1<0)
		break;
			
		Scanner sd=new Scanner(System.in);	
	   System.out.println("Enter a transaction type (Check, Debit card)");        
	   String type=sd.nextLine();
	   aa[i]=type;   
		
	   System.out.println("Enter the date of the check:");        
	   System.out.println("input yyyy-mm-dd");
	   Scanner ck=new Scanner(System.in);
	   String DATE=ck.nextLine();
	   gg[i]=DATE;
	   DateFormat df = new SimpleDateFormat("yyyy-MM-dd");   
	   try{
			Date dt1 = df.parse(DATE);
			ff[i]=dt1.getTime();
		}
		catch(Exception exception  )
		{
			exception.printStackTrace();
		}
		
		
	   
	   
	   
	   
	   
	   System.out.println("Enter the amount of the check");
		
		balance1=sc.nextDouble();
		cc[i]=balance1;
		
		i++;
		
		}
		
		/*
		ArrayList abc = new ArrayList();
		
		
		for(int k=0;k<i;k++)
		{
			abc.add(bb[k]);
		}
		
		Iterator it=abc.iterator();
		
		while(it.hasNext())
		{
			
			Object obj=it.next();
			if(!abc.contains(obj))
			  abc.add(obj);
			
		}
		
	    System.out.println("amount of check"+abc);
		*/
		
		
		
		//for(int k=0;k<i;k++)
		//{
			//if(cc[i])
			
			//sum=sum+cc[k];
			
			
		//}
		
		
		   for(int y=0;y<=s;y++ )
					{	
						for(int z=0;z<=i;z++)
						{
							if(dd[y]==bb[z])
							{
								ee[y]=ee[y]-cc[z];
							}
								else ;
						}
					}
								
		
		   
		for(i=0;i<=s-1;i++)
		{
			if(ee[i]<0)
		 System.out.println("current balance for card"+dd[i]  + "=  " +(ee[i]-35));
			else
		 System.out.println("current balance for card"+dd[i]  + "=  " +(ee[i]));		
		}
	
		
		
		
		
		
		
		//for(int j=0;j<=i+1;j++)
	   	// {
	   	//	 
	   //      	System.out.println(ff[j]);
	   //	 }
		int ss[]=new int[100];
			
			for(int t=0,kk=0;t<=i+1;t++)
			{
				ss[kk]=t;
				kk++;
			}
			
			
			
			int temp1=0;
		  long temp=0;
		  
		  for(int j=0;j<=i;j++)
		  {
		    	 for(int t=0;t<=i-j;t++)
		    	 {
		    		 if(ff[t]<ff[t+1])
		    		 {
		    			 temp=ff[t];
		    			 ff[t]=ff[t+1];
		    			 ff[t+1]=temp;
		    		     
		    			 temp1=ss[t];
		    			 ss[t]=ss[t+1];
		    			 ss[t+1]=temp1;
		    			 
		    			
		    		 }
		    		
		    	 }
		    	 
		    	 
		  } 
		    	
		//  for(int t=0;t<=i+1;t++)
		//  	 {
		//		 
	    //    	System.out.println(ff[t]);
	    //   	System.out.println(ss[t]);
		// }
			
		
		  
		  System.out.println("type  account num#   amount   date");
		  
		  
		  for(int t=0;t<=i+1;t++)
		{
			
			System.out.println(aa[ss[t]]+"      "+bb[ss[t]]+"      "+cc[ss[t]]+"      "+gg[ss[t]]);
			System.out.println();
			
		} 
  } 
	
	
	
	
	
	
	
}