package com.in;

public class Student implements Comparable {
	
	int sid;
	String Sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	@Override
	public int compareTo(Object arg0) {
		
		return 0;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", Sname=" + Sname + "]";
	}
	
	
	
	

}
