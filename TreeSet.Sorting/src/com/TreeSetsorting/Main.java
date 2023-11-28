package com.TreeSetsorting;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	
	public static void main(String[] args) {
	
		TreeSet<Employe> t=new TreeSet<Employe>();
		Scanner sc=new Scanner(System.in);
		while(true)	
		{
		System.out.println("Enter Your Choise");
		
		System.out.println("1.Id Sort \n2. Name Sort. \n3.Salary Sort.");
		int  y= sc.nextInt();
		
		switch(y)
		{
		case 1:t= new TreeSet<Employe>(new IdSort());
			
			break;
			
		case 2: t=new TreeSet<Employe>(new NameSort());
			
			break;
			
		case 3: t=new TreeSet<Employe>(new SalarySort());
			
			break;
			
			default:
				System.out.println();
			
		}
		Employe e1=new Employe();
		  e1.setId(101);
		  e1.setName("Rahul");
		  e1.setSalary(30000);
		
		  Employe e2=new Employe();
		  e2.setId(102);
		  e2.setName("Sachin");
		  e2.setSalary(20000);
		
		  Employe e3=new Employe();
		  e3.setId(103);
		  e3.setName("Amol");
		  e3.setSalary(40000);
		
		 
		  t.add(e1);
		  
		  t.add(e2);
		  t.add(e3);
		
		  for(Employe  emp:t) 
		  {
			  System.out.println(emp.getId());
			  System.out.println(emp.getName());
			  System.out.println(emp.getSalary());
		  }
	
}
	}
}
