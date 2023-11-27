package com.tech.list;

public class Student {
	
	private int sid;
	
	private String sname;
	
	
	
	public static void m1()
	{
		System.out.println("Student class m1()");
	}
	
	//get/set
	

  
public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}


   



@Override
public String toString() 
{
	return "Student Id:"+sid+" Student Name:"+sname;
}





	

	
	

}
