package com.bit.day12;

public class Ex06 {

	public static void main(String[] args) {
		// boolean ���� Ŭ����
		boolean a=false;
		Boolean boo1=new Boolean(true);
		Boolean boo2=new Boolean(a);
		Boolean boo3=new Boolean("false");
		Boolean boo4=new Boolean("TRUE");
		System.out.println(boo4);
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		
		Boolean b=Boolean.valueOf(true);
		Boolean c=Boolean.valueOf("false");
				
	}

}