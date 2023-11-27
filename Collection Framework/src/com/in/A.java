package com.in;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.TreeSet;

public  class A {

	public static void main(String[] args) {
	  int count=0;
	  
	  int count1=0;
		Object obj=new String("Hello");
		
		Class c=obj.getClass();
		
		//get methods
		System.out.println("Fully Qualified Name:"+obj.getClass().getName());
		
		Method[] declaredMethods = c.getDeclaredMethods();
		   
		for(Method   m1 :declaredMethods)
		{
			count++;
			System.out.println(m1.getName());
			
		}
		System.out.println("Total methods="+count);
		System.out.println("***********************");
		//get constructor
		Constructor[] dec = c.getDeclaredConstructors();
		
		for(Constructor con:dec)
		{
			count1++;
			System.out.println(con.getName());
		}
		System.out.println("Total coms:"+count1);
		
		//get field
		
		Field[] fields = c.getFields();
		for(Field    f:fields)
		{
			System.out.println(f);
		}
	}
	
	
}
