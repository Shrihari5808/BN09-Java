package com.in;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class B {

	public static void main(String[] args) {
		
		//HashSet s=new HashSet();
		
		LinkedHashSet s=new LinkedHashSet();
		s.add(10);
		s.add(40);
		s.add(100);
		s.add('c');
		s.add("Hello");
		s.add(20);
		s.add(10);
		
		System.out.println(s);
		
		
	}

}
