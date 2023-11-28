package com.TreeSetsorting;

import java.util.Comparator;

public class SalarySort implements Comparator< Employe> {

	@Override
	public int compare(Employe obj1, Employe obj2) {
		Employe x=(Employe)obj1;
		Employe x1=(Employe)obj2;
		
				
		return (int) (x.getSalary()-x1.getSalary());
	}

}
