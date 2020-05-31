/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jawabanbootcamp;

import java.util.Scanner;
import static javax.swing.Spring.sum;



/**
 *
 * @author ASUS
 */
public class No_8 {
  public static void main(String arg[])	
	{
                  int n;
                  int s=0,a[];                  
                  Scanner sc=new Scanner(System.in);
	   System.out.println("enter how many numbers you want sum");	 
                  n=sc.nextInt();
                  a=new int[n]; 
	   System.out.println("enter the "+n+" numbers ");
                  for(int i=0;i<n;i++)
                  {      
	             System.out.println("enter  number  "+(i+1)+":");
                            a[i]=sc.nextInt();
                  }
	   s=No_8.sumofnum(a,n);	    
                  System.out.println("sum is ="+s);                 
              	}
    static int sumofnum(int a[],int n)
   {       
       int s1=0;
             for(int i=0;i<n;i++)
                     {        
                            s1+=a[i];
                           
                      }
              return s1;
  }
}
